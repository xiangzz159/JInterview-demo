package com.mythtrad.proj3.notifyHoldLock;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/24 09:54
 * @Desc：
 */
public class Service {
    public void testMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("begin wait() ThreadName=" + Thread.currentThread().getName());
                lock.wait();
                System.out.println(    "end wait() Threadname=" + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void synNotifyMehtod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("begin notify() ThreadName=" + Thread.currentThread().getName() + "  time=" + System.currentTimeMillis());
                lock.notify();
                Thread.sleep(5000);
                System.out.println(   "end notify() ThreadName=" + Thread.currentThread().getName() + "  time=" + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
