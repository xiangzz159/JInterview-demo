package com.xiang.service.direct;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@RabbitListener(queues = {"sms.direct.queue"})
@Component
public class DirectSmsConsumer {

    @RabbitHandler
    public void reviceMessage(String message) {
        System.out.println("sms direct---接收到了订单信息是：->" + message);
    }
}