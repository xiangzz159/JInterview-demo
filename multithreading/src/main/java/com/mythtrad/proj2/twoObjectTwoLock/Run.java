package com.mythtrad.proj2.twoObjectTwoLock;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/16 16:08
 * @Desc：
 */
public class Run {
    public static void main(String[] args) {
        HasSelfPrivateNum numRef1 = new HasSelfPrivateNum();
        HasSelfPrivateNum numRef2 = new HasSelfPrivateNum();
        ThreadA threadA = new ThreadA(numRef1);
        threadA.start();
        ThreadB threadB = new ThreadB(numRef2);
        threadB.start();
    }
}
