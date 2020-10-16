package com.mythtrad.proj4.lockMethodTest3.test3;

/**
 * @Author：Yerik Xiang
 * @Date：2020/10/13 15:30
 * @Desc：
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        final Service service1 = new Service(true);
        Runnable runnable = new Runnable() {
            public void run() {
                service1.serviceMethod();
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
