package com.mythtrad.proj1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/17 16:03
 * @Desc：
 */
public class MyCallable implements Callable<Long> {
    public Long call() throws Exception {
        Long nowTime = System.currentTimeMillis();
        return nowTime;
    }

    public static void main(String[] args) {
        MyCallable myCallable = new MyCallable();
        //1.执行 Callable 方式，需要 FutureTask 实现类的支持，用于接收运算结果。
        FutureTask<Long> ft = new FutureTask<Long>(myCallable);
        new Thread(ft).start();
        //2.接收线程运算后的结果
        try {
            Long nowTime = ft.get();  //FutureTask 可用于 闭锁 类似于CountDownLatch的作用，在所有的线程没有执行完成之后这里是不会执行的
            System.out.println(nowTime);
            System.out.println("------------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
