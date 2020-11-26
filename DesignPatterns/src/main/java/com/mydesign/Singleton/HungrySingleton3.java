package com.mydesign.Singleton;

import java.io.*;
import java.lang.reflect.Method;

/**
 * @Author：Yerik Xiang
 * @Date：2020/11/8 14:41
 * @Desc：克隆破坏单例
 */
public class HungrySingleton3 implements Serializable {
    private final static HungrySingleton3 hungrySingleton = new HungrySingleton3();

    public HungrySingleton3() {
    }

    public static HungrySingleton3 getInstance() {
        return hungrySingleton;
    }

    // 该方法并非被重写的方法
    private Object readResolve(){
        return hungrySingleton;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // return super.clone();
        // 解决办法，1. 不实现 Cloneable 接口，2. 实现 Cloneable 接口，重写 clone 方法，调用 单例类的 getInstance 方法
        return getInstance();
    }


    public static void main(String[] args) throws Exception {
        HungrySingleton3 instance = HungrySingleton3.getInstance();
        Method method = hungrySingleton.getClass().getDeclaredMethod("clone");
        method.setAccessible(true);
        HungrySingleton3 cloneHungrySingleton = (HungrySingleton3) method.invoke(hungrySingleton);

        System.out.println(instance);
        System.out.println(cloneHungrySingleton);
        System.out.println(instance == cloneHungrySingleton);

    }
}

