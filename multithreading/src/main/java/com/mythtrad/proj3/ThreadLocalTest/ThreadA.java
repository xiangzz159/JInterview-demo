package com.mythtrad.proj3.ThreadLocalTest;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/27 13:37
 * @Desc：
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                Tools.tl.set("ThreadA" + (i + 1));
                System.out.println("ThreadA get Value=" + Tools.tl.get());
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
