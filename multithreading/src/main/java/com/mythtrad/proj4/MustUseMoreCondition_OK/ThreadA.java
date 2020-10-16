package com.mythtrad.proj4.MustUseMoreCondition_OK;


/**
 * @Author：Yerik Xiang
 * @Date：2020/9/29 09:34
 * @Desc：
 */
public class ThreadA extends Thread {
    private MyService myService;

    public ThreadA(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.awaitA();
    }
}
