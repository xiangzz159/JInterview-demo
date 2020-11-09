package com.mydesign.singleton;

/**
 * @Author：Yerik Xiang
 * @Date：2020/11/8 13:41
 * @Desc：使用ThreadLocal实现单例模式
 * ThreadLocal会为每一个线程提供一个独立的变量副本，从而隔离了多个线程对数据的访问冲突。对于多线程资源共享的问题，同步机制(synchronized)采用了“以时间换空间”的方式，而ThreadLocal采用了“以空间换时间”的方式。
 * 同步机制仅提供一份变量，让不同的线程排队访问，而ThreadLocal为每一个线程都提供了一份变量，因此可以同时访问而互不影响。
 */
public class ThreadLocalSingleton {
    private static final ThreadLocal<ThreadLocalSingleton> singleton = new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };
    public static ThreadLocalSingleton getInstance() {
        return singleton.get();
    }

    private ThreadLocalSingleton() {}
}
