package com.mythtrad.proj2.t2;

import com.mythtrad.proj2.t2.HasSelfPrivateNum;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/16 15:37
 * @Desc：在HasSelPrivateNum的addI方法前加上synchronized关键字实现线程安全
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
