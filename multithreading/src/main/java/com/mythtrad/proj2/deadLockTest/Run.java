package com.mythtrad.proj2.deadLockTest;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/21 15:59
 * @Desc：
 */
public class Run {
    public static void main(String[] args) {
        try {
          DealThread tl = new DealThread();
          tl.setFlag("a");
          Thread thread1 = new Thread(tl);
          thread1.start();
          Thread.sleep(100);
          tl.setFlag("b");
          Thread thread2 = new Thread(tl);
          thread2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
