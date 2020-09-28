package com.mythtrad.proj3.test2;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/23 09:58
 * @Desc：
 */
public class Run {
    public static void main(String[] args) {
        try {
            Object lock = new Object();
            MyThread1 t1 = new MyThread1(lock);
            MyThread2 t2 = new MyThread2(lock);
            t1.start();
            Thread.sleep(3000);
            t2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
