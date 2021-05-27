package com.xiang.service.direct;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@RabbitListener(queues = {"email.direct.queue"})
@Component
public class DirectEmailConsumer {
    @RabbitHandler
    public void reviceMessage(String message) {
        System.out.println("email direct---接收到了订单信息是：->" + message);
    }
}
