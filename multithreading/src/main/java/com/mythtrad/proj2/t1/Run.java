package com.mythtrad.proj2.t1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/16 15:37
 * @Desc：方法中的变量不会引起非线程安全问题。这是因为方法内部的变量是私有的特性造成的
 */
public class Run {
    public static void main(String[] args) {
        HasSelfPrivateNum numRef = new HasSelfPrivateNum();
        ThreadA threadA = new ThreadA(numRef);
        threadA.start();
        ThreadB threadB = new ThreadB(numRef);
        threadB.start();
    }
}
