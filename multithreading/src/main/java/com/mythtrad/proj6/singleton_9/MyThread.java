package com.mythtrad.proj6.singleton_9;

/**
 * @Author：Yerik Xiang
 * @Date：2020/10/20 20:05
 * @Desc：
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(MyObject.connectionFactory.getConnection().hashCode());
        }
    }

    public static void main(String[] args) {
        com.mythtrad.proj6.singleton_8.MyThread t1 = new com.mythtrad.proj6.singleton_8.MyThread();
        com.mythtrad.proj6.singleton_8.MyThread t2 = new com.mythtrad.proj6.singleton_8.MyThread();
        com.mythtrad.proj6.singleton_8.MyThread t3 = new com.mythtrad.proj6.singleton_8.MyThread();
        t1.start();
        t2.start();
        t3.start();
    }
}
