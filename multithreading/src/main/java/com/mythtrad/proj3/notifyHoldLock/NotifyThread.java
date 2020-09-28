package com.mythtrad.proj3.notifyHoldLock;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/24 09:59
 * @Desc：
 */
public class NotifyThread extends Thread {
    private Object lock;

    public NotifyThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.synNotifyMehtod(lock);
    }
}
