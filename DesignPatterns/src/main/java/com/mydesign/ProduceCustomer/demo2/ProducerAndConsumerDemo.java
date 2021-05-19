package com.mydesign.ProduceCustomer.demo2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author：Yerik Xiang
 * @Date：2021/5/11 15:49
 * @Desc：
 */
public class ProducerAndConsumerDemo {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        Condition full = lock.newCondition();
        Condition empty = lock.newCondition();
        Production production = new Production();
        Thread thread1 = new Thread(new Producer(production, full, empty, lock));
        Thread thread2 = new Thread(new Consumer(production, full, empty, lock));
        thread1.start();
        thread2.start();

    }
}
