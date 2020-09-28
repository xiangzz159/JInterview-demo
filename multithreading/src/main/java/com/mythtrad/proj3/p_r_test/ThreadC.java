package com.mythtrad.proj3.p_r_test;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/25 10:03
 * @Desc：
 */
public class ThreadC extends Thread {
    private C r;

    public ThreadC(C r) {
        this.r = r;
    }

    @Override
    public void run() {
        while (true) {
            r.getValue();
        }
    }
}
