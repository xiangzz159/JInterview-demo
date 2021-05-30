[docker安装rabbitmq](https://registry.hub.docker.com/_/rabbitmq/)
```shell script
docker run -di --name rabbit-node1 -e RABBITMQ_DEFAULT_USER=root -e RABBITMQ_DEFAULT_PASS=root -p 15672:15672 -p 5672:5672 -p 25672:25672 -p 61613:61613 -p 1883:1883 rabbitmq:management
```

启动成功后登入rabbit后管:http://127.0.0.1:15672/#/


[rabbit讲解](https://www.rabbitmq.com/getstarted.html)

# 核心概念
- Server：又称Broker，接受客户端的连接，实现AMQP实体服务，安装rabbitmq-server
- Connection：连接，应用程序与Broker的网络连接，TCP/IP 三次握手和四次挥手
- Channel：几乎所有的操作都在Channel中进行，Channel是进行消息读写的捅到，客户端可以建立对Channel，每个Channel代表一个回话
- Message：服务与应用程序之间传送的数据，由Properties和body组成，Properties可是对消息进行修饰，比如消息的优先级，延迟等高级性能，Body则是消息体的内容
- Virtual Host：用于进行逻辑隔离，最上层的消息路由，一个虚拟主机可以由若干个Exchange和Queue，同一个虚拟主机里面不能有相同名字的Exchange
- Exchange：接受信息，根据路由键发送消息到绑定的队列（不具备消息存储的能力）
- Bindings：Exchange和Queue之间的虚拟连接，binding中可以保护多个routing key
- Routing key：是一个路由规则，虚拟机可以用它来确定如何路由一个特定消息
- Queue：保存消息并将它们转发给消费者

# RabbitMQ支持消息的模式
1. 简单模式
2. 工作模式：分发机制（轮询分发和公平分发）
3. 发布订阅模式：是一种广播机制，他没有路由key的模式
4. 路由模式：有routing-key的匹配模式
5. 主题Topic模式：模糊的routing-key的匹配模式
6. 参数模式：参数匹配模式

# 什么样的消息会进入死信队列（DLX）？
1. 消息被拒绝
2. 消息过期
3. 队列达到最大长度  

开发过程中队列创建后如果想要修改队列参数需要删除该队列后重新创建，否则会报错，并且不会更新队列
```shell script
2021-05-28 10:06:31.874 ERROR 13923 --- [ 127.0.0.1:5672] o.s.a.r.c.CachingConnectionFactory       : Channel shutdown: channel error; protocol method: #method<channel.close>(reply-code=406, reply-text=PRECONDITION_FAILED - inequivalent arg 'x-dead-letter-exchange' for queue 'ttl.direct.queue' in vhost '/': received the value 'dead_direct_exchange' of type 'longstr' but current is none, class-id=50, method-id=10)
```

# RabbitMQ的内存控制
## 设置内存阈值
### 命令方式：
```shell script
rabbitmqctl set_vm_memory_high_watermark <fraction>
rabbitmqctl set_vm_memory_high_watermark absolute <50MB/2GB>
```

faction/value为内存阈值，默认情况是：0.4/2GB，代表含义是：当RabbitMQ的内存超过40%时。就会产生警告，并且阻塞所有生产者的连接。通过此命令修改阈值在Broker重启以后将会失效，通过修改配置文件方式设置的阈值则不会随着重启而消失，但修改了配置文件一样要重启Broker才会生效

### 配置文件方式：
```shell script
# 默认
# vm_memory_high_watermark.relative = 0.4
# 使用relative相对值进行设置fraction，建议取值在0.4~0.7之间，不建议超过0.7
vm_memory_high_watermark.relative = 0.6
# 使用absolute的相对值的方式，但是KB，MB，GB相对命令如下
vm_memory_high_watermark.absolute = 2GB
```

## RabbitMQ内存换页
在某个Broker节点及内存阻塞生产者之前，他会尝试将队列中的消息换页到磁盘以释放内存空间，持久化和非持久化的消息都会写入磁盘中，其中此久化的消息本身就在磁盘中有一个副本，所以在转移的过程中持久化的消息会先从内存中清除掉。
> 默认情况下，内存到达的阈值是50%时就会换页处理。

```shell script
# 设置换页触发阈值
vm_memory_high_watermark.paging_ration = 0.5
```
## RabbitMQ的磁盘预警
当磁盘的剩余空间低于确定的阈值时，RabbitMQ同样会阻塞生产者，这样可以避免因非持久化的消息持续换页而耗尽磁盘空间导致服务器崩溃
```shell script
disk_free_limit.relative = 1.0

disk_free_limit.absolute = 1GB
```

## 解决消息重试的几种方案
1. 控制重发次数
2. try + catch + 手动ack
3. try + catch + 手动ack + 死信队列



# 分布式事务
分布式事务指事务的操作位于不同节点上，需要保证事务的ACID特性。

例如在下单场景中，库存和订单如果不在同一节点上，就设计分布式事务
## 二阶段提交（Two-phase-commit 2PC）需要数据库产商支持，Java组件有atomikos等
通过引入协调者（Coordinator）来协调参与者的行为，并最终决定这些参与者是否要真正执行事务

1. 同步阻塞，所有事务参与者在等待响应的时候处于同步阻塞状态，无法进行其他操作
2. 单点问题，协调者在2PC中起到非常大的作用，发生故障将会造成很大影响，特别是在阶段二发生故障，所有参与者会一直等待状态，无法完成其他操作
3. 数据不一致，在阶段二，如果协调者只发送了部分commit消息，此时网络发生异常，那么只有部分参与者接受到commit消息，也就是说只有部分参与者提交了事务，使得系统数据不一致
4. 太过保守，任意一个节点失败就会导致整个事务失败，没有完善容错机制

## 补偿事务（TCC）
针对每一个操作，都要注册一个与其相对应的确认和补偿操作。它分为三个阶段：
- Try阶段主要是对业务系统做检查及资源预留
- Confirm阶段主要是对业务系统做确认提交，Try阶段执行成功并开始执行Confirm阶段时，默认----Confirm阶段是不会出错的
- Cancel阶段主要是在业务执行错误，需要回滚的状态下执行的业务取消，预留资源释放

优点：跟2PC比起来，实现流程相对简单一些，但是数据的一致性比2PC要差

缺点：在2，3步中都有可能失败，TCC属于应用层的一种补偿方式，所以需要程序员在实现的时候多谢很多补偿的代码，在一些场景中，一些业务流程可能用TCC不太好定义及处理

## 本地消息表（异步确保）
本地消息表与业务数据处于同一数据库中，这样就能利用本地事务来确保在对者两个表操作满足事务特性，并且使用了消息队列来确保最终一致性

- 在分布式事务操作的一方完成写业务的操作之后向本地消息表发送一个消息，本地事务能保证这个消息一定会被写入本地消息表中
- 之后将本地消息表中的消息转发到MQ等消息队列中，如果转发成功则将消息从本地消息表中删除，否则继续重新发送
- 在分布式事务操作的另一方从消息队列中读取一个消息，并执行消息中的操作

优点：一种非常典型的实现，避免了分布式事务，实现了最终一致性

缺点：消息表会耦合到业务系统中，如果没有分装好解决方案，会有很多杂活需要处理

## MQ事务消息
有一些第三方的MQ是支持事务消息的，比如RockerMQ，它们支持事务消息的方式也是类似于采用的二阶段提交，但是市面上一些主流的MQ都是不支持事务的，比如Kafka

以RabbitMQ为例子，其思路大致为：
1. 在第一阶段Preared消息，会拿到消息的地址。第二阶段执行本地事务，第三阶段通过第一阶段拿到的地址去访问消息，并修改状态
2. 也就是说在业务方法内要想消息队列提交两次请求，一次发送消息和一次确认消息。如果确认消息发送失败了，RabbitMQ会定期扫描消息集群中的事务消息，这时候发现了Prepared消息，他会向消息发送者确认，所以生产方需要实现一个check接口，RabbitMQ会更具发送段设置的策略来决定是回滚还是继续发送确认消息，这样就保证了消息发送与本地事务同时成功或者同时失败

优点： 实现了最终一致性，不需要依赖本地数据库事务

缺点：实现难度大，主流MQ不支持，RockerMQ事务消息部分代码也未开源


