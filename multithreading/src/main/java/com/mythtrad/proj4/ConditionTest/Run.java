package com.mythtrad.proj4.ConditionTest;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/29 10:07
 * @Desc：
 */
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        ThreadA a = new ThreadA(myService);
        ThreadB b = new ThreadB(myService);
        a.start();
        b.start();
    }
}
