package com.mythtrad.proj3.ThreadLocalTest;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/27 13:40
 * @Desc：
 */
public class Run {
    public static void main(String[] args) {
        try {
            ThreadA a = new ThreadA();
            ThreadB b = new ThreadB();
            a.start();
            b.start();
            for (int i = 0; i < 100; i++) {
                Tools.tl.set("Main" + (i + 1));
                System.out.println("Main get Value=" + Tools.tl.get());
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
