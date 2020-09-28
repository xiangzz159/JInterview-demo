package com.mythtrad.proj2.volatileTestThread;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/22 09:54
 * @Desc：
 */
public class NewMyThread extends Thread {
    public static int count;
    synchronized private static void addCount() {
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
