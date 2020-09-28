package com.mythtrad.proj3.notifyHoldLock;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/24 09:58
 * @Desc：
 */
public class ThreadA extends Thread {
    private Object lock;

    public ThreadA(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testMethod(lock);
    }
}
