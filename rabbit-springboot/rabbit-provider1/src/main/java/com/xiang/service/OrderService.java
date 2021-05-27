package com.xiang.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrderService {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void makeOrder(String userId, String productId, int num) {
        // 1: 根据商品id查询库存是否充足
        // 2: 保存订单
        String orderId = UUID.randomUUID().toString();
        System.out.println("订单生成成功：" + orderId);
        // 3: 通过MQ完成消息分发

        String exchangeName = "fanout_order_exchange";
        String routingKey = "";
        rabbitTemplate.convertAndSend(exchangeName, routingKey, orderId);
    }

    public void makeOrderDirect(String userId, String productId, int num) {
        // 1: 根据商品id查询库存是否充足
        // 2: 保存订单
        String orderId = UUID.randomUUID().toString();
        System.out.println("订单生成成功：" + orderId);
        // 3: 通过MQ完成消息分发

        String exchangeName = "direct_order_exchange";
        rabbitTemplate.convertAndSend(exchangeName, "duanxin", orderId);
        rabbitTemplate.convertAndSend(exchangeName, "sms", orderId);
    }

    public void makeOrderTopic(String userId, String productId, int num) {
        // 1: 根据商品id查询库存是否充足
        // 2: 保存订单
        String orderId = UUID.randomUUID().toString();
        System.out.println("订单生成成功：" + orderId);
        // 3: 通过MQ完成消息分发

        String exchangeName = "topic_order_exchange";
        String routingKey = "com.duanxin";
        rabbitTemplate.convertAndSend(exchangeName, routingKey, orderId);
    }
}
