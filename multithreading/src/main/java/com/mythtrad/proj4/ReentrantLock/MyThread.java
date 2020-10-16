package com.mythtrad.proj4.ReentrantLock;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/28 14:14
 * @Desc：
 */
public class MyThread extends Thread {
    private MyService myService;

    public MyThread(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.testMethos();
    }
}
