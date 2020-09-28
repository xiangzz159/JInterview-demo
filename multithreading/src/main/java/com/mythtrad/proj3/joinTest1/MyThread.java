package com.mythtrad.proj3.joinTest1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/25 14:22
 * @Desc：
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            int secondValue = (int) (Math.random() * 10000);
            System.out.println(secondValue);
            Thread.sleep(secondValue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
