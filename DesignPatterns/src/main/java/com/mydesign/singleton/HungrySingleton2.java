package com.mydesign.singleton;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * @Author：Yerik Xiang
 * @Date：2020/11/8 14:41
 * @Desc：反射攻击破坏单例
 */
public class HungrySingleton2 implements Serializable {
    private final static HungrySingleton2 hungrySingleton = new HungrySingleton2();

    public HungrySingleton2() {
    }

    public static HungrySingleton2 getInstance() {
        return hungrySingleton;
    }

    public static void main(String[] args) throws Exception {
        Class objectClass = HungrySingleton2.class;
        Constructor constructor = objectClass.getDeclaredConstructor();
        HungrySingleton2 instance = HungrySingleton2.getInstance();

        constructor.setAccessible(true);
        HungrySingleton2 object = (HungrySingleton2) constructor.newInstance();

        System.out.println(instance);
        System.out.println(object);
        System.out.println(instance == object);

    }
}

