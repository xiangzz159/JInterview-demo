package com.mythtrad.proj4.ConditionTestManyToMany;


/**
 * @Author：Yerik Xiang
 * @Date：2020/9/29 10:07
 * @Desc：
 */
public class ThreadB extends Thread {
    private MyService myService;

    public ThreadB(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        while (true) {
            try {
                myService.get();
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
