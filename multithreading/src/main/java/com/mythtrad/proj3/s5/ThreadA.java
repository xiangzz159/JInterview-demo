package com.mythtrad.proj3.s5;

import java.util.Date;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/27 13:57
 * @Desc：
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 20; i++) {
                if (Tools.tl.get() == null) {
                    Tools.tl.set(new Date());
                }
                System.out.println("A " + Tools.tl.get().getTime());
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
