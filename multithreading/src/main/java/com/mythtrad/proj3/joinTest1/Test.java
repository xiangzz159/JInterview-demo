package com.mythtrad.proj3.joinTest1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/25 14:22
 * @Desc：
 */
public class Test {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            myThread.join();
            System.out.println("我想当myThread对象执行完毕后我再执行。");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
