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
public class DeadRabbitMqConfiguration {
    // 1:声明注册direct模式的交换机
    @Bean
    public DirectExchange deadExchange() {
        return new DirectExchange("dead_direct_exchange", true, false);
    }
    // 2:声明队列
    @Bean
    public Queue deadQueue() {
        return new Queue("dead.direct.queue", true);
    }

    @Bean
    public Binding deadBinding() {
        return BindingBuilder.bind(deadQueue()).to(deadExchange()).with("dead");
    }

}
