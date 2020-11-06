package com.mythtrad.proj6.executor;

import java.util.concurrent.*;

import static java.util.concurrent.TimeUnit.MILLISECONDS;

/**
 * @Author：Yerik Xiang
 * @Date：2020/10/30 09:48
 * @Desc：
 */
public class ThreadPoolExecutorDemo2 {
    public static void main(String[] args) {
        //线程池的创建
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 10,
                100, MILLISECONDS, new ArrayBlockingQueue<Runnable>(5));
        //添加任务
        Future future= threadPoolExecutor.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                String a ="return call";
                return a;
            }
        });
        try {
            System.out.println(future.get());//future.get()调用call()方法的返回结果
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally{
            threadPoolExecutor.shutdown();
        }
    }
}
