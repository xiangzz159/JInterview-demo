package com.mydesign.ProduceCustomer.demo2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author：Yerik Xiang
 * @Date：2021/5/11 15:45
 * @Desc：
 */
public class Producer implements Runnable {
    private Production production;
    private Condition full;
    private Condition empty;
    private ReentrantLock lock;

    public Producer(Production production, Condition full, Condition empty, ReentrantLock lock) {
        this.production = production;
        this.full = full;
        this.empty = empty;
        this.lock = lock;
    }

    public void run() {
        while (true) {
            lock.lock();
            while (production.getI() != null) {
                try {
                    full.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            int i = (int) (Math.random() * 100);
            production.setI(i);
            System.out.println("生产者：" + i);
            empty.signal();
            lock.unlock();
        }
    }
}
