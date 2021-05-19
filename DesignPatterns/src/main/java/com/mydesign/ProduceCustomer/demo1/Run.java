package com.mydesign.ProduceCustomer.demo1;

/**
 * @Author：Yerik Xiang
 * @Date：2021/5/11 15:40
 * @Desc：
 */
public class Run {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Consumer consumer = new Consumer(buffer, 1);
        Producer producer = new Producer(buffer, 2);
        consumer.start();
        producer.start();
    }
}
