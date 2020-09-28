package com.mythtrad.proj3.join_sleep_1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/27 10:50
 * @Desc：
 */
public class ThreadB extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("b run begin timer=" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("b run end time=" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void bService() {
        System.out.println("打印了bService timer=" + System.currentTimeMillis());
    }
}
