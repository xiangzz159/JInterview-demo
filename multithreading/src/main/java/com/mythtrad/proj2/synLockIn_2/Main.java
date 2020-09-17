package com.mythtrad.proj2.synLockIn_2;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/17 13:25
 * @Desc：
 */
public class Main {
    public int i = 10;
    synchronized public void operateIMainMethod() {
        try {
            i--;
            System.out.println("main print i=" + i);
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
