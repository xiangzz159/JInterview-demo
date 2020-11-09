package com.mydesign.singleton;

/**
 * @Author：Yerik Xiang
 * @Date：2020/11/8 13:13
 * @Desc：懒汉单例模式最基本的实现方式，这种实现最大的问题就是不支持多线程。因为没有加锁 synchronized，所以严格意义上它并不算单例模式。
 * 这种方式 lazy loading 很明显，不要求线程安全，在多线程不能正常工作。
 */
public class Lazy1 {
    private static Lazy1 instance;

    public Lazy1() {
    }

    public static Lazy1 getInstance() {
        if (instance == null) {
            instance = new Lazy1();
        }
        return instance;
    }
}
