package com.mythtrad.proj3.join_sleep_1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/27 10:52
 * @Desc：
 */
public class ThreadC extends Thread {
    private ThreadB threadB;

    public ThreadC(ThreadB threadB) {
        this.threadB = threadB;
    }

    @Override
    public void run() {
        threadB.bService();
    }
}
