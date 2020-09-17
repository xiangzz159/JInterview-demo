package com.mythtrad.proj2.t6;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/17 13:57
 * @Desc：
 */
public class MyThread1 extends Thread {
    private Task task;

    public MyThread1(Task task) {
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        CommUtils.beginTime1 = System.currentTimeMillis();
        task.doLongTimeTask();
        CommUtils.endTime1 = System.currentTimeMillis();
    }
}
