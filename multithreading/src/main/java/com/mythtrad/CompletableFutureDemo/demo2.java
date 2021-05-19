package com.mythtrad.CompletableFutureDemo;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @Author：Yerik Xiang
 * @Date：2021/5/18 19:41
 * @Desc：https://www.deathearth.com/1503.html
 * 使用CountDownLatch
* 平均耗时：83ms
 */
public class demo2 {
    // 下载数据
    public static void downMathMLToImage() throws InterruptedException {
        Thread.sleep((long) ((1 + Math.random())* 20));
    }
    // 转成图片
    public static void buildMathML2Img() throws InterruptedException {
        Thread.sleep((long) ((2 + Math.random())* 20));
    }

    private static final AtomicLong sumTime = new AtomicLong(0L);

    // 使用CountDownLatch

    public static void main(String[] args) throws InterruptedException {
        int count = 100;
        ExecutorService threadPool = Executors.newFixedThreadPool(10);
        final CountDownLatch countDownLatch = new CountDownLatch(6);
        for (int i = 0; i < count; i++) {
            final int threadnum = i;
            threadPool.execute(() -> {
                try {
                    sumTime.addAndGet(-1 * System.currentTimeMillis());
                    downMathMLToImage();
                    buildMathML2Img();
                    sumTime.addAndGet(System.currentTimeMillis());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    System.out.println(threadnum + " is finished, now is " + sumTime.get());
                    countDownLatch.countDown();
                }
            });
        }
        countDownLatch.await();
        threadPool.shutdown();
    }
}
