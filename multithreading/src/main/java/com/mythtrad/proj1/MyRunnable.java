package com.mythtrad.proj1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/17 16:01
 * @Desc：
 */
public class MyRunnable implements Runnable {
    public void run() {
        System.out.println("MyRunnable");
    }

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
        System.out.println("End!");
    }
}
