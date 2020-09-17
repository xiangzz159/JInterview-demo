package com.mythtrad.proj2.t5;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/17 13:59
 * @Desc：
 */
public class MyThread2 extends Thread {
    private Task task;

    public MyThread2(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        CommUtils.beginTime2 = System.currentTimeMillis();
        task.doLongTimeTask();
        CommUtils.endTime2 = System.currentTimeMillis();
    }
}
