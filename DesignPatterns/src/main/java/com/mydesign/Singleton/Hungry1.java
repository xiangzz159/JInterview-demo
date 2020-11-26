package com.mydesign.Singleton;

/**
 * @Author：Yerik Xiang
 * @Date：2020/11/8 13:15
 * @Desc：
 */
public class Hungry1 {
    private static Hungry1 instance = new Hungry1();

    public Hungry1() {
    }

    public static Hungry1 getInstance() {
        return instance;
    }
}
