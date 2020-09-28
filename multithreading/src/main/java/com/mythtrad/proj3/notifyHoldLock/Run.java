package com.mythtrad.proj3.notifyHoldLock;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/24 10:04
 * @Desc：
 */
public class Run {
    public static void main(String[] args) {
        Object lock = new Object();
        ThreadA a = new ThreadA(lock);
        a.start();
        NotifyThread notifyThread = new NotifyThread(lock);
        notifyThread.start();
        SynNotifyMethodThread synNotifyMethodThread = new SynNotifyMethodThread(lock);
        synNotifyMethodThread.start();
    }
}
