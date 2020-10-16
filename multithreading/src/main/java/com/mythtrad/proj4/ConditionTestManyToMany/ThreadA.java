package com.mythtrad.proj4.ConditionTestManyToMany;


/**
 * @Author：Yerik Xiang
 * @Date：2020/9/29 10:05
 * @Desc：
 */
public class ThreadA extends Thread {
    private MyService myService;

    public ThreadA(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        while (true) {
            try {
                myService.set();
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
