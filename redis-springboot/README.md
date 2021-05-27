# redis-springboot

## 通过Docker配置Redis集群

### 拉取redis镜像
```shell
docker pull redis
```

### 创建redis容器
```shell
docker run -d -p 6379:6379 --name redis-node1 --restart always --privileged=true redis --appendonly yes
docker run -d -p 6380:6379 --name redis-node2 --restart always --privileged=true redis --appendonly yes
docker run -d -p 6381:6379 --name redis-node2 --restart always --privileged=true redis --appendonly yes
```


```
    -p 6380:6380 端口映射：前表示主机部分，：后表示容器部分。
    --name redis1  指定该容器名称，查看和进行操作都比较方便。
    –restart always: 开机启动
    –privileged=true: 提升容器内权限
    -v 挂载目录，规则与端口映射相同。
    为什么需要挂载目录：个人认为docker是个沙箱隔离级别的容器，这个是它的特点及安全机制，不能随便访问外部（主机）资源目录，所以需要这个挂载目录机制。
    -d redis 表示后台启动redis
    redis-server /etc/redis/redis.conf  以配置文件启动redis，加载容器内的conf文件，最终找到的是挂载的目录/usr/local/docker/redis.conf
    --appendonly yes  开启redis 持久化
```

### 使用docker命令查看容器ip地址
```shell
docker inspect redis-node1 redis-node2 redis-node3 | grep IPAddress
        "SecondaryIPAddresses": null,
        "IPAddress": "172.17.0.5",
                "IPAddress": "172.17.0.5",
        "SecondaryIPAddresses": null,
        "IPAddress": "172.17.0.6",
                "IPAddress": "172.17.0.6",
        "SecondaryIPAddresses": null,
        "IPAddress": "172.17.0.7",
                "IPAddress": "172.17.0.7",

```
### 进入从节点redis容器,并设置自己的主节点
```shell
docker exec -it redis-node2 redis-cli
127.0.0.1:6379> SLAVEOF 172.17.0.5 6379
OK
exit
docker exec -it redis-node2 redis-cli
127.0.0.1:6379> SLAVEOF 172.17.0.5 6379
OK
exit
```

### 进入主节点查看从节点信息
```shell
docker exec -it redis redis-cli
info replication    # 查看redis信息
# Replication
role:master
connected_slaves:3
slave1:ip=172.17.0.6,port=6379,state=online,offset=864,lag=0
slave2:ip=172.17.0.7,port=6379,state=online,offset=864,lag=1
master_replid:d6b6117c6cafe96c591add499ca4760a15d0ff59
master_replid2:3680558217926f7fe4d0b7e963b3fe0f166f65b9
master_repl_offset:864
second_repl_offset:197
repl_backlog_active:1
repl_backlog_size:1048576
repl_backlog_first_byte_offset:1
repl_backlog_histlen:864
127.0.0.1:6379>
```

### 其他
方法1：认谁当爹（命令）
```shell
SLAVEOF IP PORT

SLAVEOF NO ONE
```

方法2：认谁当儿子（命令）
```shell
CLUSTER MEET IP PORT
# redis.conf需要开启cluster-enabled yes
```

方法3：配置文件配置
```shell
replicaof <masterip> <masterport>
```


缓存穿透：大量请求的 key 根本不存在于缓存中，导致请求直接到了数据库上，根本没有经过缓存这一层
    - 设置无效缓存：这种方式可以解决请求的 key 变化不频繁的情况，如果黑客恶意 攻击，每次构建不同的请求 key，会导致 Redis 中缓存大量无效的 key
    - 布隆过滤器：先判断 用户发来的请求的值是否存在于布隆过滤器中。不存在的话，直接返回请求参数错误信息给客户 端，存在的话才会走下面的流程。

缓存击穿：热点key在某个时间突然失效，导致大量请求直接到数据库上
    - 设置永不失效缓存
    - 设置缓存时候加锁

缓存雪崩：缓存在同一时间大面积的失效，后面的请求 都直接落到了数据库上，造成数据库短时间内承受大量请求
    - redis集群（针对 Redis 服务不可用的情况）
    - 限流，避免同时间大规模请求（针对 Redis 服务不可用的情况）
    - 缓存永不失效（针对热点缓存失效的情况）
    - 设置不同的失效时间比如随机设置缓存的失效时间。（针对热点缓存失效的情况）

mysq与redis数据一致性
- 延迟双删：在写库前后都进行redis.del(key)操作，并且设定合理的超时时间。
- 异步更新缓存(基于订阅binlog的同步机制)：MySQL binlog增量订阅消费+消息队列+增量数据更新到redis，这里可以结合使用canal(阿里的一款开源框架)，通过该框架可以对MySQL的binlog进行订阅，而canal正是模仿了mysql的slave数据库的备份请求，使得Redis的数据更新达到了相同的效果。
- 删除失败问题解决：
    1. 重试
    2. 设置过期时间