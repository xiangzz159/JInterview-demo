package com.mythtrad.proj4.z3_ok;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/28 17:15
 * @Desc：
 */
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        ThreadA threadA = new ThreadA(myService);
        threadA.start();
    }

}
