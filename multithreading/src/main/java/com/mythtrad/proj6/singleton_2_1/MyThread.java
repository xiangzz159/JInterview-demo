package com.mythtrad.proj6.singleton_2_1;


/**
 * @Author：Yerik Xiang
 * @Date：2020/10/19 15:10
 * @Desc：
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(MyObject.getInstance().hashCode());
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        t1.start();
        t2.start();
        t3.start();
    }
}
