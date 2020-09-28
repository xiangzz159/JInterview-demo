package com.mythtrad.proj2.volatileTestThread;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/22 09:49
 * @Desc：验证volatile非原子性
 */
public class MyThread extends Thread {
    volatile public static int count;
    private static void addCount() {
        for (int i = 0; i < 100; i++) {
            count++;
        }
        System.out.println("coun=" + count);
    }

    @Override
    public void run() {
        addCount();
    }

    public static void main(String[] args) {
        MyThread[] myThreadsArray = new MyThread[100];
        for (int i = 0; i < 100; i++) {
            myThreadsArray[i] = new MyThread();
        }
        for (int i = 0; i < 100; i++) {
            myThreadsArray[i].start();
        }
    }
}
