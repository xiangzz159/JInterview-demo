package com.mydesign.Singleton;

/**
 * @Author：Yerik Xiang
 * @Date：2020/11/8 13:57
 * @Desc：通过给getInstance方法添加synchronized实现简单的线程安全
 */
public class Lazy2 {
    private static Lazy2 instance;

    public Lazy2() {
    }

    public synchronized static Lazy2 getInstance() {
        if (instance == null) {
            instance = new Lazy2();
        }
        return instance;
    }
}
