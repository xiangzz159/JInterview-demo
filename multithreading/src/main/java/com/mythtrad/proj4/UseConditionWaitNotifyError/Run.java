package com.mythtrad.proj4.UseConditionWaitNotifyError;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/28 17:11
 * @Desc：程序报错，必须在condition.await()方法调用之前调用lock.lock()
 */
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        ThreadA threadA = new ThreadA(myService);
        threadA.start();
    }
}
