package com.mythtrad.proj3.ThreadLocalTest;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/27 13:38
 * @Desc：
 */
public class ThreadB extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                Tools.tl.set("ThreadB" + (i + 1));
                System.out.println("ThreadB get Value=" + Tools.tl.get());
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
