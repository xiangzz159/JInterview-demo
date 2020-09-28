package com.mythtrad.proj2.AtomicIntegerTest;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/22 10:09
 * @Desc：
 */
public class MyThread extends Thread {
    private AtomicNoSafe atomicNoSafe;

    public MyThread(AtomicNoSafe atomicNoSafe) {
        this.atomicNoSafe = atomicNoSafe;
    }

    @Override
    public void run() {
        atomicNoSafe.addNum();
    }
}
