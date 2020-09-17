package com.mythtrad.proj2.t3;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/17 10:10
 * @Desc：
 */
public class ThreadA extends Thread {
    private PublicVar publicVar;

    public ThreadA(PublicVar publicVar) {
        super();
        this.publicVar = publicVar;
    }

    @Override
    public void run() {
        super.run();
        publicVar.setValue("B", "BB");
    }
}
