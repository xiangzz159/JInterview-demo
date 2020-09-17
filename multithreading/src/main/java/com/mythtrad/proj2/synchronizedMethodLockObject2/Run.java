package com.mythtrad.proj2.synchronizedMethodLockObject2;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/17 09:52
 * @Desc：线程A先持有将MyObject对象锁，但线程B完全可以异步调用非synchronized类型的方法。试试将MyObject类中的methodB()方法前加上synchronized关键字
 * 1. A线程先持有object对象的Lock锁，B线程可以以异步的方式调用object对象中非synchronized类型的方法
 * 2. A线程先持有object对象的Lock锁，B线程如果在这时候调用object对象中的synchronized类型的方法则需要等待，也就是同步
 */
public class Run {
    public static void main(String[] args) {
        MyObject object = new MyObject();
        ThreadA a = new ThreadA(object);
        a.setName("A");
        ThreadB b = new ThreadB(object);
        b.setName("B");
        a.start();
        b.start();
    }
}
