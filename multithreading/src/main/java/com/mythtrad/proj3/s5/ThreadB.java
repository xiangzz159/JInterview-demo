package com.mythtrad.proj3.s5;

import sun.jvm.hotspot.tools.Tool;

import java.util.Date;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/27 13:58
 * @Desc：
 */
public class ThreadB extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 20; i++) {
                if (Tools.tl.get() == null) {
                    Tools.tl.set(new Date());
                }
                System.out.println("B " + Tools.tl.get().getTime());
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
