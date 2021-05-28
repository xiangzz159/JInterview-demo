package com.xiang.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class TTLRabbitMqConfiguration {
    // 1:声明注册direct模式的交换机
    @Bean
    public DirectExchange ttlExchange() {
        return new DirectExchange("ttl_direct_exchange", true, false);
    }
    // 2:声明队列
    @Bean
    public Queue ttlDirectQueue() {
        Map<String, Object> args = new HashMap<>();
        // 设置过期时间
        args.put("x-message-ttl", 5000);

        // 过期消息关联死信队列交换机名
        args.put("x-dead-letter-exchange", "dead_direct_exchange");
        // 如果设置了路由key，需要添加
        args.put("x-dead-letter-routing-key", "dead");
        return new Queue("ttl.direct.queue", true, false, false, args);
    }
    @Bean
    public Queue ttlDirectMessageQueue() {
        Map<String, Object> args = new HashMap<>();
        // 设置过期时间
        args.put("x-message-ttl", 5000);
        return new Queue("ttl.message.direct.queue", true);
    }
    @Bean
    public Binding directTtlBinding() {
        return BindingBuilder.bind(ttlDirectQueue()).to(ttlExchange()).with("ttl");
    }

    @Bean
    public Binding directTtlMessageBinding() {
        return BindingBuilder.bind(ttlDirectMessageQueue()).to(ttlExchange()).with("ttlmessage");
    }
}
