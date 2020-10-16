package com.mythtrad.proj4.z3_ok;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/28 17:14
 * @Desc：
 */
public class ThreadA extends Thread {
    private MyService myService;

    public ThreadA(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.waitMethod();
    }
}
