package com.mydesign.singleton;

/**
 * @Author：Yerik Xiang
 * @Date：2020/11/8 14:13
 * @Desc：静态内部类
 * 静态内部类的方式效果类似双检锁，但实现更简单。但这种方式只适用于静态域的情况，双检锁方式可在实例域需要延迟初始化时使用。
 */
public class InnerClass {
    private static class SingletonHolder {
        private static final InnerClass INSTANCE = new InnerClass();
    }

    public InnerClass() {
    }
    public static final InnerClass getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
