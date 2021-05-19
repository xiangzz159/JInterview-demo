package com.mythtrad.CompletableFutureDemo;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author：Yerik Xiang
 * @Date：2021/5/18 19:41
 * @Desc：https://www.deathearth.com/1503.html
 * 未优化方法1
 * 平均耗时：87ms
 */
public class demo1 {
    // 下载数据
    public static void downMathMLToImage() throws InterruptedException {
        Thread.sleep((long) ((1 + Math.random())* 20));
    }
    // 转成图片
    public static void buildMathML2Img() throws InterruptedException {
        Thread.sleep((long) ((2 + Math.random())* 20));
    }


    public static void main(String[] args) throws InterruptedException {
        int count = 100;
        Long sumTime = 0L;
        for (int i = 0; i < count; i++) {
            sumTime -= System.currentTimeMillis();
            downMathMLToImage();
            buildMathML2Img();
            sumTime += System.currentTimeMillis();
        }
        System.out.println("平均耗时：" + sumTime / count + "ms");


    }
}
