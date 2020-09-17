package com.mythtrad.proj2.synLockIn_2;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/17 13:26
 * @Desc：
 */
public class Sub extends Main {
    synchronized public void operateISubMethod() {
        try {
            while (i > 0) {
                i--;
                System.out.println("sub print i=" + i);
                Thread.sleep(100);
                this.operateIMainMethod();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
