package com.mythtrad.proj4.UseConditionWaitNotifyOk;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/28 17:26
 * @Desc：
 */
public class Run{
    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();
        ThreadA threadA = new ThreadA(myService);
        threadA.start();
        Thread.sleep(3000);
        myService.signal();
    }

}
