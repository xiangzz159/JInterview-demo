package com.mythtrad.proj3.joinMoreTest;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/27 11:13
 * @Desc：
 */
public class RunFirst {
    public static void main(String[] args) {
        ThreadB b = new ThreadB();
        ThreadA a = new ThreadA(b);
        a.start();
        b.start();
        System.out.println("main end=" + System.currentTimeMillis());
    }
}
