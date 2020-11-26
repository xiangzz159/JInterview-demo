package com.mydesign.Singleton;

/**
 * @Author：Yerik Xiang
 * @Date：2020/11/8 14:16
 * @Desc：枚举实现单例模式
 * 枚举enum和静态代码块特性相似，在使用枚举类时，构造方法会被自动调用，也可以应用其这个特性实现单例设计模式
 */
public enum  EnumSingleton {
    INSTANCE;
    public void anyMethod() {}
}
