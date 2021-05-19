package com.mydesign.ProduceCustomer.demo2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author：Yerik Xiang
 * @Date：2021/5/11 15:47
 * @Desc：
 */
public class Consumer implements Runnable {
    private Production production;
    private Condition full;
    private Condition empty;
    private ReentrantLock lock;

    public Consumer(Production production, Condition full, Condition empty, ReentrantLock lock) {
        this.production = production;
        this.full = full;
        this.empty = empty;
        this.lock = lock;
    }

    public void run() {
        while(true) {
            lock.lock();
            while (production.getI() == null) {
                try {
                    empty.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("消费者：" + production.getI());
            production.setI(null);
            full.signal();
            lock.unlock();
        }
    }
}
