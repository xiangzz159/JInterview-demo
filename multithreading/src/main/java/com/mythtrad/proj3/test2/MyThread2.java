package com.mythtrad.proj3.test2;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/23 09:56
 * @Desc：
 */
public class MyThread2 extends Thread {
    private Object lock;

    public MyThread2(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            System.out.println("开始 notify time=" + System.currentTimeMillis());
            lock.notify();
            System.out.println("结束 notify time=" + System.currentTimeMillis());
        }
    }
}
