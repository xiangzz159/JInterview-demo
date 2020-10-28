package com.mythtrad.proj6.others;

import java.sql.Connection;
import java.util.Random;

/**
 * @Author：Yerik Xiang
 * @Date：2020/10/28 16:38
 * @Desc：
 */
public class TestSemphore {

    private static SemaphoreDemo semaphoreDemo = new SemaphoreDemo();

    private static class BusiThread extends Thread {
        @Override
        public void run() {
            Random r = new Random();//让每个线程持有连接的时间不一样
            long start = System.currentTimeMillis();
            Connection connection = semaphoreDemo.getConnection();
            System.out.println("Thread_" + Thread.currentThread().getId()
                    + "_获取数据库连接共耗时:" + (System.currentTimeMillis() - start) + "ms.....");
            //模拟业务操作，线程持有连接查询数据
            try {
                Thread.sleep(100 + r.nextInt(100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("查询数据完成，归还连接！");
            semaphoreDemo.releaseConnection(connection);
        }
    }


    public static void main(String[] args) {

        for (int i = 0; i < 50; i++) {
            new BusiThread().start();
        }
    }
}
