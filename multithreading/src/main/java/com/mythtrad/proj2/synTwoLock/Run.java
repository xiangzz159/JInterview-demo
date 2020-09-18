package com.mythtrad.proj2.synTwoLock;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/18 16:07
 * @Desc：线程A、B持有Class锁，线程C持有对象锁，导致异步输出
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
        ThreadC c = new ThreadC(service);
        c.setName("C");
        c.start();
    }
}
