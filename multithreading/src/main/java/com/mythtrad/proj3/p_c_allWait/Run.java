package com.mythtrad.proj3.p_c_allWait;


/**
 * @Author：Yerik Xiang
 * @Date：2020/9/25 10:03
 * @Desc：
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        String lock = new String("");
        P p = new P(lock);
        C r = new C(lock);
        ThreadP[] threadPs = new ThreadP[2];
        ThreadC[] threadCs = new ThreadC[2];
        for (int i = 0; i < 2; i++) {
            threadPs[i] = new ThreadP(p);
            threadPs[i].setName("生产者" + (i + 1));
            threadCs[i] = new ThreadC(r);
            threadCs[i].setName("消费者" + (i + 1));
            threadCs[i].start();
            threadPs[i].start();
        }
        Thread.sleep(5000);
        Thread[] threadArray = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
        Thread.currentThread().getThreadGroup().enumerate(threadArray);
        for (int i = 0; i < threadArray.length; i++) {
            System.out.println(threadArray[i].getName() + " " + threadArray[i].getState());
        }
    }
}
