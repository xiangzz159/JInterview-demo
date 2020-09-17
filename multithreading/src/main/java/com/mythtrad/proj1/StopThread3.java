package com.mythtrad.proj1;


/**
 * @Author：Yerik Xiang
 * @Date：2020/9/16 10:46
 * @Desc：使用return + interrupt()结合使用停止线程
 */
public class StopThread3 extends Thread {
    @Override
    public void run() {
        while (true) {
            if (this.isInterrupted()) {
                System.out.println("停止了！");
                return;
            }
            System.out.println("Time: " + System.currentTimeMillis());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        StopThread3 stopThread3 = new StopThread3();
        stopThread3.start();
        Thread.sleep(2000);
        stopThread3.interrupt();
    }
}
