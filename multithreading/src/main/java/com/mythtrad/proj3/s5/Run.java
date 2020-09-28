package com.mythtrad.proj3.s5;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/27 13:59
 * @Desc：
 */
public class Run {
    public static void main(String[] args) {
        try {
            ThreadA a = new ThreadA();
            a.start();
            Thread.sleep(1000);
            ThreadB b = new ThreadB();
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
