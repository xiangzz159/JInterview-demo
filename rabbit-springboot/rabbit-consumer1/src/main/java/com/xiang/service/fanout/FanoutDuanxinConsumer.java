package com.xiang.service.fanout;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@RabbitListener(queues = {"duanxin.fanout.queue"})
@Component
public class FanoutDuanxinConsumer {

    @RabbitHandler
    public void reviceMessage(String message) {
        System.out.println("duanxin fanout---接收到了订单信息是：->" + message);
    }
}
