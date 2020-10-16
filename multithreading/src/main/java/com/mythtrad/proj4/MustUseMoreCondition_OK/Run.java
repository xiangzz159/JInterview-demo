package com.mythtrad.proj4.MustUseMoreCondition_OK;


/**
 * @Author：Yerik Xiang
 * @Date：2020/9/29 09:35
 * @Desc：
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();
        ThreadA a = new ThreadA(myService);
        ThreadB b = new ThreadB(myService);
        a.setName("A");
        a.start();
        b.setName("B");
        b.start();
        Thread.sleep(3000);
        myService.signalAll_A();

        Thread.sleep(3000);
        myService.signalAll_B();
    }
}
