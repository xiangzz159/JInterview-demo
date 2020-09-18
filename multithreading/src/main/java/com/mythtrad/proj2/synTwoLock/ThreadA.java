package com.mythtrad.proj2.synTwoLock;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/18 16:05
 * @Desc：
 */
public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        Service.printA();
    }
}
