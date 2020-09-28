package com.mythtrad.proj3.stack_4;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/25 10:50
 * @Desc：
 */
public class P_Thread extends Thread {
    private P p;

    public P_Thread(P p) {
        this.p = p;
    }

    @Override
    public void run() {
        while (true) {
            p.pushService();
        }
    }
}
