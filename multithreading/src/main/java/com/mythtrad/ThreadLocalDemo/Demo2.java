package com.mythtrad.ThreadLocalDemo;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author：Yerik Xiang
 * @Date：2021/6/2 15:37
 * @Desc：
 */
public class Demo2 {
    public static void main(String[] args) {
        ThreadFactory nameFactory = new ThreadFactoryBuilder()
                .setNameFormat("demo-pool-%d").build();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(20, 20, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>(1024), nameFactory);
        for (int i = 0; i < 20; i++) {
            // java.lang.NumberFormatException: For input string: ""
//            threadPoolExecutor.execute(() -> System.out.println(DateUtils.parse("2021-06-02 08:00:00")));
            // 成功
//            threadPoolExecutor.execute(() -> System.out.println(DateUtils.parseNew("2021-06-02 08:00:00")));
            // 成功
//            threadPoolExecutor.execute(() -> System.out.println(DateUtils.parseThreadLocal("2021-06-02 08:00:00")));
            // 异常
//            threadPoolExecutor.execute(() -> System.out.println(DateUtils.parseSingle("2021-06-02 08:00:00")));
            // 成功
//            threadPoolExecutor.execute(() -> System.out.println(DateUtils.parseSync("2021-06-02 08:00:00")));
            // 成功
            threadPoolExecutor.execute(() -> System.out.println(DateUtils.parseDateTime("2021-06-02 08:00:00")));
        }
        threadPoolExecutor.shutdown();
    }
}
