package com.mythtrad.proj4.Fair_noFair_test;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/29 15:07
 * @Desc：
 */
public class RunFair {
    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service(true);
        Runnable runnable = new Runnable() {
            public void run() {
                System.out.println("*线程" + Thread.currentThread().getName() + "运行了");
                service.serviceMethod();
            }
        };
        Thread[] threadArray = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threadArray[i] = new Thread(runnable);
        }
        for (int i = 0; i < 10; i++) {
            threadArray[i].start();
        }
    }
}
