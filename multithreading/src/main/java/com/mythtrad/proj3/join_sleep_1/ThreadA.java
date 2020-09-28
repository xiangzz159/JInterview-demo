package com.mythtrad.proj3.join_sleep_1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/27 10:50
 * @Desc：
 */
public class ThreadA extends Thread {
    private ThreadB b;

    public ThreadA(ThreadB b) {
        this.b = b;
    }

    @Override
    public void run() {
        try {
            synchronized (b) {
                b.start();
                Thread.sleep(6000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
