package com.mythtrad.proj2.synLockIn_2;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/17 13:28
 * @Desc：当存在父子类继承关系时，子类是完全可以通过"可重入锁"调用弗雷的同步方法的
 */
public class Run extends Thread {
    @Override
    public void run() {
        Sub sub = new Sub();
        sub.operateISubMethod();
    }

    public static void main(String[] args) {
        Run run = new Run();
        run.start();
    }
}
