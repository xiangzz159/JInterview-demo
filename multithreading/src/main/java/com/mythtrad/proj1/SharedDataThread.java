package com.mythtrad.proj1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/14 17:10
 * @Desc：
 */
public class SharedDataThread extends Thread {
    private int count = 5;
    @Override
    public void run() {
        super.run();
        count--;
        System.out.println(Thread.currentThread().getName() + "计算得到当前count为：" + count);
    }

    public static void main(String[] args) {
        SharedDataThread sharedDataThread = new SharedDataThread();
        Thread t1 = new Thread(sharedDataThread, "t1");
        Thread t2 = new Thread(sharedDataThread, "t2");
        Thread t3 = new Thread(sharedDataThread, "t3");
        Thread t4 = new Thread(sharedDataThread, "t4");
        Thread t5 = new Thread(sharedDataThread, "t5");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
