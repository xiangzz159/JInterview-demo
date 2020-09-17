package com.mythtrad.proj1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/16 10:51
 * @Desc：suspend()暂停线程， resume()恢复线程执行
 */
public class SuspendThread1 extends Thread {
     private long i = 0;

    public long getI() {
        return i;
    }

    public void setI(long i) {
        this.i = i;
    }

    @Override
    public void run() {
        while (true) {
            i++;
        }
    }


    public static void main(String[] args) throws InterruptedException {
        SuspendThread1 suspendThread1 = new SuspendThread1();
        suspendThread1.start();
        Thread.sleep(1000);
        // A段
        suspendThread1.suspend();
        System.out.println("A1: " + System.currentTimeMillis() + " i: " + suspendThread1.getI());
        Thread.sleep(2000);
        System.out.println("A2: " + System.currentTimeMillis() + " i: " + suspendThread1.getI());
        // B段
        suspendThread1.resume();
        Thread.sleep(2000);
        // C段
        suspendThread1.suspend();
        System.out.println("B1: " + System.currentTimeMillis() + " i: " + suspendThread1.getI());
        Thread.sleep(2000);
        System.out.println("B2: " + System.currentTimeMillis() + " i: " + suspendThread1.getI());
    }
}
