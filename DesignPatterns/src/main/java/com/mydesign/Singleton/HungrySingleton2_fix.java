package com.mydesign.Singleton;

import java.io.Serializable;
import java.lang.reflect.Constructor;

/**
 * @Author：Yerik Xiang
 * @Date：2020/11/8 14:41
 * @Desc：反射攻击解决方案：在私有化构造器中添加防止通过反射调用的代码（只针对在类加载初始化时就已经创建好单例对象的单例模式有效）即（饿汉式和基于内部类实现懒加载的单例模式有效，对其他懒加载无效）
 */
public class HungrySingleton2_fix implements Serializable {
    private final static HungrySingleton2_fix hungrySingleton = new HungrySingleton2_fix();

    public HungrySingleton2_fix() {
        if (hungrySingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static HungrySingleton2_fix getInstance() {
        return hungrySingleton;
    }

    public static void main(String[] args) throws Exception {
        Class objectClass = HungrySingleton2_fix.class;
        Constructor constructor = objectClass.getDeclaredConstructor();
        HungrySingleton2_fix instance = HungrySingleton2_fix.getInstance();

        constructor.setAccessible(true);
        HungrySingleton2_fix object = (HungrySingleton2_fix) constructor.newInstance();

        System.out.println(instance);
        System.out.println(object);
        System.out.println(instance == object);

    }
}



/**
 * 单例：静态内部类，基于类初始化的延迟加载解决方案
 */
/*
public class StaticInnerClassSingleton {
    // 私有化构造器
    private StaticInnerClassSingleton() {
        // 在单例类的私有化构造方法中添加防放射破坏代码,如果是通过反射调用就抛出运行时异常
        if (InnerClass.staticInnerClassSingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    // 静态内部类的静态初始化锁，哪个线程拿到哪个线程就去初始化它
    private static class InnerClass {
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.staticInnerClassSingleton;
    }
}
*/
