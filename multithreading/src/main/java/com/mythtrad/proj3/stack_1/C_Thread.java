package com.mythtrad.proj3.stack_1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/25 10:52
 * @Desc：
 */
public class C_Thread extends Thread {
    private C r;

    public C_Thread(C r) {
        this.r = r;
    }

    @Override
    public void run() {
        while (true) {
            r.popService();
        }
    }
}
