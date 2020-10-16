package com.mythtrad.proj4.MustUseMoreCondition_OK;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/29 09:46
 * @Desc：
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    public Condition conditionA = lock.newCondition();
    public Condition conditionB = lock.newCondition();
    public void awaitA() {
        try {
            lock.lock();
            System.out.println("begin awaitA 时间为:" + System.currentTimeMillis() + " ThreadName=" + Thread.currentThread().getName());
            conditionA.await();
            System.out.println("  end awaitA 时间为:" + System.currentTimeMillis() + " ThreadName=" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void awaitB() {
        try {
            lock.lock();
            System.out.println("begin awaitB 时间为:" + System.currentTimeMillis() + " ThreadName=" + Thread.currentThread().getName());
            conditionB.await();
            System.out.println("  end awaitB 时间为:" + System.currentTimeMillis() + " ThreadName=" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void signalAll_A() {
        try {
            lock.lock();
            System.out.println("  signalAll_A时间为:" + System.currentTimeMillis() + "ThreadName=" + Thread.currentThread().getName());
            conditionA.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public void signalAll_B() {
        try {
            lock.lock();
            System.out.println("  signalAll_B时间为:" + System.currentTimeMillis() + "ThreadName=" + Thread.currentThread().getName());
            conditionB.signalAll();
        } finally {
            lock.unlock();
        }
    }
}
