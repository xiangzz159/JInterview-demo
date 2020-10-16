package com.mythtrad.proj4.ReadWriteLockBegin1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/10/15 17:26
 * @Desc：
 */
public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.read();
    }
}
