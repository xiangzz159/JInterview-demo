package com.mythtrad.proj3.joinMoreTest;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/27 11:09
 * @Desc：
 */
public class Run1 {
    public static void main(String[] args) {
        try {
            ThreadB b = new ThreadB();
            ThreadA a = new ThreadA(b);
            a.start();
            b.start();
            b.join(2000);
            System.out.println("main end " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
