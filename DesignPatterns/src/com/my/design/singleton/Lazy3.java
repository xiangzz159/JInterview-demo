package com.my.design.singleton;

/**
 * @Author：Yerik Xiang
 * @Date：2020/11/8 13:52
 * @Desc：双重检查锁(DCL)
 * 综合了懒汉式和饿汉式两者的优缺点整合而成。看上面代码实现中，特点是在synchronized关键字内外都加了一层 if 条件判断，这样既保证了线程安全，又比直接上锁提高了执行效率，还节省了内存空间。
 */
public class Lazy3 {
    private static Lazy3 instance;

    private Lazy3(){}

    public static Lazy3 getInstance() {
        if (instance == null) {
            synchronized (Lazy3.class) {
                if (instance == null) {
                    instance = new Lazy3();
                }
            }
        }
        return instance;
    }
}
