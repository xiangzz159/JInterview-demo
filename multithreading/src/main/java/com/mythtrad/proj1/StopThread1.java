package com.mythtrad.proj1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/15 17:29
 * @Desc：
 */
public class StopThread1 extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i=0; i<500000; i++) {
            System.out.println("i=" + (i + 1));
        }
    }

    public static void main(String[] args) {
        try {
            StopThread1 stopThread1 = new StopThread1();
            stopThread1.start();
            Thread.sleep(200);
            stopThread1.interrupt();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("End!");
    }
}
