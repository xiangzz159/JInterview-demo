package com.my.design.singleton;

/**
 * @Author：Yerik Xiang
 * @Date：2020/11/8 13:57
 * @Desc：通过给getInstance方法中添加synchronized实现简单的线程安全
 */
public class Lazy2_2 {
    private static Lazy2_2 instance;

    public Lazy2_2() {
    }

    public static Lazy2_2 getInstance() {
        synchronized (Lazy2_2.class) {
            if (instance == null) {
                instance = new Lazy2_2();
            }
        }
        return instance;
    }
}
