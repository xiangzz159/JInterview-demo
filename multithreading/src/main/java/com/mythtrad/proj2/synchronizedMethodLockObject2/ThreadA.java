package com.mythtrad.proj2.synchronizedMethodLockObject2;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/17 09:51
 * @Desc：
 */
public class ThreadA extends Thread {
    private MyObject myObject;

    public ThreadA(MyObject myObject) {
        super();
        this.myObject = myObject;
    }

    @Override
    public void run() {
        super.run();
        myObject.methodA();
    }
}
