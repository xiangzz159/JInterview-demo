package com.mythtrad.proj3.notifyHoldLock;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/24 10:03
 * @Desc：
 */
public class SynNotifyMethodThread extends Thread {
    private Object lock;

    public SynNotifyMethodThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.synNotifyMehtod(lock);

    }
}
