package com.mythtrad.proj3.p_r_test;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/25 10:03
 * @Desc：
 */
public class Run {
    public static void main(String[] args) {
        String lock = new String("");
        P p = new P(lock);
        C r = new C(lock);
        ThreadP pThread = new ThreadP(p);
        ThreadC rThread = new ThreadC(r);
        pThread.start();
        rThread.start();
    }
}
