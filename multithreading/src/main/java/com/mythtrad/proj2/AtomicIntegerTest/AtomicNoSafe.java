package com.mythtrad.proj2.AtomicIntegerTest;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/22 10:07
 * @Desc：会发现打印的顺序和数据都是错误的，应为addAndGet()方法是原子的，但是方法和方法之间调用不是原子的。在addNum()方法前加上synchronized解决
 */
public class AtomicNoSafe {
    public static AtomicLong alRef = new AtomicLong();
    public void addNum() {
        System.out.println(Thread.currentThread().getName() + " 加了100之后的值是：" + alRef.addAndGet(100));
        alRef.addAndGet(1);
    }

    public static void main(String[] args) {
        try {
            AtomicNoSafe service = new AtomicNoSafe();
            MyThread[] array = new MyThread[5];
            for (int i = 0; i < array.length; i++) {
                array[i] = new MyThread(service);
            }
            for (int i = 0; i < array.length; i++) {
                array[i].start();
            }
            Thread.sleep(1000);
            System.out.println(alRef.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

