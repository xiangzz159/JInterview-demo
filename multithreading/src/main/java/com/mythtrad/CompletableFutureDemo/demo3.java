package com.mythtrad.CompletableFutureDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

/**
 * @Author：Yerik Xiang
 * @Date：2021/5/18 19:41
 * @Desc：https://www.deathearth.com/1503.html
 * 使用CompletableFuture
 * 平均耗时：87ms
 */
public class demo3 {
    // 下载数据
    public static void downMathMLToImage() throws InterruptedException {
        Thread.sleep((long) ((1 + Math.random())* 20));
    }
    // 转成图片
    public static void buildMathML2Img() throws InterruptedException {
        Thread.sleep((long) ((2 + Math.random())* 20));
    }

    public static Long doUploadFile() throws InterruptedException {
        long bg = System.currentTimeMillis();
        downMathMLToImage();
        buildMathML2Img();
        return System.currentTimeMillis() - bg;
    }


        private static final AtomicLong sumTime = new AtomicLong(0L);

    // 使用CountDownLatch

    public static void main(String[] args) throws InterruptedException {
        int count = 100;
        ExecutorService threadPool = Executors.newFixedThreadPool(10);
        List<CompletableFuture<Long>> futureList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            futureList.add(CompletableFuture.supplyAsync(() -> {
                try {
                    return doUploadFile();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return null;
            }, threadPool));

        }

        CompletableFuture<Void> completableFuture=CompletableFuture.allOf(futureList.toArray(new CompletableFuture[0]));
        completableFuture.join();

        Map<Long, String> map = new HashMap<Long, String>();
        try {
            map = futureList.stream().map(y -> {
                try {
                    return y.get();
                } catch ( Exception e) {
                    e.printStackTrace();
                }
                return null;
            }).collect(Collectors.toMap(null, null));

        } catch ( Exception e) {
            e.printStackTrace();
        }
    }
}
