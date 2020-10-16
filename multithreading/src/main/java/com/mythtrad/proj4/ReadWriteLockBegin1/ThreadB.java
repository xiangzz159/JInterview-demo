package com.mythtrad.proj4.ReadWriteLockBegin1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/10/15 17:27
 * @Desc：
 */
public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.write();
    }
}
