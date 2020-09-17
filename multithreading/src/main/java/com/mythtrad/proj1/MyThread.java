package com.mythtrad.proj1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/14 15:00
 * @Desc：
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("MyThread");
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("运行结束！");
    }
}
