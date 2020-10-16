package com.mythtrad.proj4.lockMethodTest2.test1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/10/13 14:33
 * @Desc：
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        final  Service service = new Service();
        Runnable runnable = new Runnable() {
            public void run() {
                service.waitMethod();
            }
        };
        Thread threadA = new Thread(runnable);
        threadA.start();
        Thread.sleep(500);
        Thread threadB = new Thread(runnable);
        threadB.start();
        Thread.sleep(500);
        System.out.println(service.lock.hasQueuedThread(threadA));
        System.out.println(service.lock.hasQueuedThread(threadB));
        System.out.println(service.lock.hasQueuedThreads());
    }

}
