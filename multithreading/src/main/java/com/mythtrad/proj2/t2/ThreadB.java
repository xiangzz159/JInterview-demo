package com.mythtrad.proj2.t2;

import com.mythtrad.proj2.t2.HasSelfPrivateNum;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/16 15:35
 * @Desc：
 */
public class ThreadB extends Thread {
    private HasSelfPrivateNum numRef;
    public ThreadB(HasSelfPrivateNum numRef) {
        super();
        this.numRef = numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.addI("b");
    }
}
