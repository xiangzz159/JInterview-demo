package com.mydesign.Singleton;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @Author：Yerik Xiang
 * @Date：2020/11/8 13:36
 * @Desc：使用CAS乐观锁技术实现单例模式
 * 优点：用CAS的好处在于不需要使用传统的锁机制来保证线程安全，CAS是一种基于忙等待的算法，依赖底层硬件的实现，相对于锁它没有线程切换和阻塞的额外消耗，可以支持较大的并行度。
 * 缺点：CAS的一个重要缺点在于如果忙等待一直执行不成功(一直在死循环中)，会对CPU造成较大的执行开销。
 * 另外，代码中，如果N个线程同时执行到 singleton = new Singleton();的时候，会有大量对象被创建，可能导致内存溢出。
 */
public class CasSingleton {
    private static final AtomicReference<CasSingleton> INSTANCE = new AtomicReference<CasSingleton>();

    public CasSingleton() {
    }
    public static CasSingleton getInstance() {
        for (;;) {
            CasSingleton singleton = INSTANCE.get();
            if (null != singleton) {
                return singleton;
            }
            singleton = new CasSingleton();
            if (INSTANCE.compareAndSet(null, singleton)) {
                return singleton;
            }
        }
    }
}
