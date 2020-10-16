package com.mythtrad.proj4.tryLock_param;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author：Yerik Xiang
 * @Date：2020/10/15 09:29
 * @Desc：
 */
public class MyService {
    public ReentrantLock lock = new ReentrantLock();
    public void waitMethod() {
        try {
            if (lock.tryLock(3, TimeUnit.SECONDS)) {
                System.out.println("    " + Thread.currentThread().getName() + " 获得锁的时间：" + System.currentTimeMillis());
                Thread.sleep(1000);
            } else {
                System.out.println("    " + Thread.currentThread().getName() + " 没有获得锁");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (lock.isHeldByCurrentThread()) {
                lock.unlock();
            }
        }
    }
}
