package com.mythtrad.proj6.executor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;

import static java.util.concurrent.TimeUnit.MILLISECONDS;

/**
 * @Author：Yerik Xiang
 * @Date：2020/10/30 09:48
 * @Desc：
 */
public class ThreadPoolExecutorDemo1 {
    public static void main(String[] args) {
        //线程池的创建
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5,10 ,
                100 ,MILLISECONDS,new ArrayBlockingQueue<Runnable>(5));
        //提交线程池任务
        threadPoolExecutor.execute(new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread 1 execute work" );
            }
        }));
        //停止线程池
        threadPoolExecutor.shutdown();
    }
}
