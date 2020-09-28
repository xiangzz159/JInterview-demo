package com.mythtrad.proj3.join_sleep_1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/27 10:53
 * @Desc：
 */
public class Run {
    public static void main(String[] args) {
        try {
            ThreadB b = new ThreadB();
            ThreadA a = new ThreadA(b);
            a.start();
            Thread.sleep(1000);
            ThreadC c = new ThreadC(b);
            c.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
