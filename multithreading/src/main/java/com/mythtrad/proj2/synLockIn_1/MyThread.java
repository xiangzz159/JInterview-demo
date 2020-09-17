package com.mythtrad.proj2.synLockIn_1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/17 13:21
 * @Desc：可重入锁：当一个线程得到一个对象锁后，再次请求该对象锁时是可以再次得到该对象的锁的。可重入锁也支持在父子类继承的环境中
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        Service service = new Service();
        service.service1();
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
