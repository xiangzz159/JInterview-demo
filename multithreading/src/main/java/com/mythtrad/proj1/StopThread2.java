package com.mythtrad.proj1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/15 17:29
 * @Desc：
 */
public class StopThread2 extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i=0; i<500000; i++) {
            if (this.isInterrupted()) {
                System.out.println("已经停止状态了，我要退出了！");
                break;
            }
            System.out.println("i=" + (i + 1));
        }
        System.out.println("我被输出，如果此代码是for循环又继续运行，线程并未停止！");
    }

    public static void main(String[] args) {
        try {
            StopThread2 stopThread2 = new StopThread2();
            stopThread2.start();
            Thread.sleep(200);
            stopThread2.interrupt();
        } catch (Exception e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("End!");
    }
}
