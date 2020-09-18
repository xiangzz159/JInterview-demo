package com.mythtrad.proj2.t9;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/18 15:39
 * @Desc：
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyOneList list = new MyOneList();
        MyThread1 thread1 = new MyThread1(list);
        MyThread2 thread2 = new MyThread2(list);
        thread1.setName("A");
        thread1.start();
        thread2.setName("B");
        thread2.start();
        Thread.sleep(6000);
        System.out.println("ListSize=" + list.getSize());
    }
}
