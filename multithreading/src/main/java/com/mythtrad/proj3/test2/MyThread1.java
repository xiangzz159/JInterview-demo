package com.mythtrad.proj3.test2;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/23 09:54
 * @Desc：
 */
public class MyThread1 extends Thread {
    private Object lock;

    public MyThread1(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                System.out.println("开始   wait time=" + System.currentTimeMillis());
                lock.wait();
                System.out.println("结束   wait time=" + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
