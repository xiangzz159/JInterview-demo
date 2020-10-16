package com.mythtrad.proj4.MustUseMoreCondition_Error;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/29 09:35
 * @Desc：
 */
public class ThreadB extends Thread {
    private MyService myService;

    public ThreadB(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.awaitB();
    }
}
