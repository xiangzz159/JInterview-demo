[docker安装rabbitmq](https://registry.hub.docker.com/_/rabbitmq/)
```shell script
docker run -di --name rabbit-node1 -e RABBITMQ_DEFAULT_USER=root -e RABBITMQ_DEFAULT_PASS=root -p 15672:15672 -p 5672:5672 -p 25672:25672 -p 61613:61613 -p 1883:1883 rabbitmq:management
```

启动成功后登入rabbit后管:http://127.0.0.1:15672/#/


[rabbit讲解](https://www.rabbitmq.com/getstarted.html)

核心概念：
- Server：又称Broker，接受客户端的连接，实现AMQP实体服务，安装rabbitmq-server
- Connection：连接，应用程序与Broker的网络连接，TCP/IP 三次握手和四次挥手
- Channel：几乎所有的操作都在Channel中进行，Channel是进行消息读写的捅到，客户端可以建立对Channel，每个Channel代表一个回话
- Message：服务与应用程序之间传送的数据，由Properties和body组成，Properties可是对消息进行修饰，比如消息的优先级，延迟等高级性能，Body则是消息体的内容
- Virtual Host：用于进行逻辑隔离，最上层的消息路由，一个虚拟主机可以由若干个Exchange和Queue，同一个虚拟主机里面不能有相同名字的Exchange
- Exchange：接受信息，根据路由键发送消息到绑定的队列（不具备消息存储的能力）
- Bindings：Exchange和Queue之间的虚拟连接，binding中可以保护多个routing key
- Routing key：是一个路由规则，虚拟机可以用它来确定如何路由一个特定消息
- Queue：保存消息并将它们转发给消费者

RabbitMQ支持消息的模式
1. 简单模式
2. 工作模式：分发机制（轮询分发和公平分发）
3. 发布订阅模式：是一种广播机制，他没有路由key的模式
4. 路由模式：有routing-key的匹配模式
5. 主题Topic模式：模糊的routing-key的匹配模式
6. 参数模式：参数匹配模式