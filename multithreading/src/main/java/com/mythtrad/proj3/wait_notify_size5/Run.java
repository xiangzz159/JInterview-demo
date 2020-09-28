package com.mythtrad.proj3.wait_notify_size5;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/23 10:15
 * @Desc：
 */
public class Run {
    public static void main(String[] args) {
        try {
            Object lock = new Object();
            ThreadA a = new ThreadA(lock);
            a.start();
            Thread.sleep(100);
            ThreadB b = new ThreadB(lock);
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
