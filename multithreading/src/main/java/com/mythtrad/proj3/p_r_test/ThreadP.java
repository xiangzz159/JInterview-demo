package com.mythtrad.proj3.p_r_test;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/25 10:02
 * @Desc：
 */
public class ThreadP extends Thread {
    private P p;

    public ThreadP(P p) {
        this.p = p;
    }

    @Override
    public void run() {
        while (true) {
            p.setValue();
        }
    }
}
