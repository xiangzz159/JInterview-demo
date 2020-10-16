package com.mythtrad.proj4.tryLockTest;

/**
 * @Author：Yerik Xiang
 * @Date：2020/10/14 17:29
 * @Desc：
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        final MyService myService = new MyService();
        Runnable runnable = new Runnable() {
            public void run() {
                myService.waitMethod();
            }
        };
        Thread threadA = new Thread(runnable);
        threadA.setName("A");
        threadA.start();
        Thread threadB = new Thread(runnable);
        threadB.setName("B");
        threadB.start();
    }
}
