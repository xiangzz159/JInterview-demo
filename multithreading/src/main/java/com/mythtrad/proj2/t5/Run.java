package com.mythtrad.proj2.t5;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/17 13:59
 * @Desc：
 */
public class Run {
    public static void main(String[] args) {
        Task task = new Task();
        MyThread1 myThread1 = new MyThread1(task);
        myThread1.start();
        MyThread2 myThread2 = new MyThread2(task);
        myThread2.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long beginTime = CommUtils.beginTime1;
        if (CommUtils.beginTime2 < CommUtils.beginTime1) {
            beginTime = CommUtils.beginTime2;
        }
        long endTime = CommUtils.endTime1;
        if (CommUtils.endTime2 > CommUtils.endTime1) {
            endTime = CommUtils.endTime2;
        }
        System.out.println("耗时：" + (endTime - beginTime));
    }
}
