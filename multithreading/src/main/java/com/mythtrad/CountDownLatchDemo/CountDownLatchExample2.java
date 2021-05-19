package com.mythtrad.CountDownLatchDemo;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author：Yerik Xiang
 * @Date：2021/5/18 18:05
 * @Desc：不使用CountDownLatch
 */
public class CountDownLatchExample2 {
    // 线程数量
    private static final int threadCount = 6;
    private static final AtomicInteger atomicInteger = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        // 创建一个具有固定线程数量的线程池对象
        ExecutorService threadPool = Executors.newFixedThreadPool(10);
        for (int i = 0; i < threadCount; i++) {
            final int threadnum = i;
            threadPool.execute(() -> {
                try {
                    for (int i1 = 0; i1 < 1000000; i1++) {
                        atomicInteger.addAndGet(1);
                    }
                } finally {
                    System.out.println(threadnum + " is finished, now is " + atomicInteger.get());
                }
            });
        }
        threadPool.shutdown();
        System.out.println("finish");
        System.out.println(atomicInteger.get());

    }
}
