package com.mythtrad.proj6.others;

import java.util.concurrent.CountDownLatch;

/**
 * @Author：Yerik Xiang
 * @Date：2020/10/28 15:37
 * @Desc： CountDownLatch计数器演示，由外部线程控制一组线程的放行
 */
public class CountDownLatchDemo {
    private static CountDownLatch countDownLatch = new CountDownLatch(6);
    private static class InitThread extends Thread {
        @Override
        public void run() {
            System.out.println("InitThread线程" + Thread.currentThread().getName() + "开始初始化....");
            countDownLatch.countDown();
        }
    }
    private static class BusiThread extends Thread {

        @Override
        public void run() {
            try {
                System.out.println("BusiThread线程" + Thread.currentThread().getName() + "准备运行....");
                //只有等countDownLatch的计数器为0，也就是其他计数器的线程都执行完了，才能执行
                countDownLatch.await();
                Thread.sleep(1000);
                System.out.println("BusiThread线程" + Thread.currentThread().getName() + "运行完成....");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("主线程" + Thread.currentThread().getName() + "开始初始化....");
                countDownLatch.countDown();
            }
        }, "main-2").start();
        new BusiThread().start();
        for (int i = 0; i < 5; i++) {
            new InitThread().start();
        }
        try {
            countDownLatch.await();
            System.out.println("主线程运行结束.......");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
