package com.mythtrad.proj2.synchronizedMethodLockObject2;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/17 09:51
 * @Desc：
 */
public class ThreadB extends Thread {
    private MyObject myObject;
    public ThreadB(MyObject myObject) {
        super();
        this.myObject = myObject;
    }

    @Override
    public void run() {
        super.run();
        myObject.methodB();
    }
}
