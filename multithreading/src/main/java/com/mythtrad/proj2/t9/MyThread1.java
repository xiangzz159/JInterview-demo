package com.mythtrad.proj2.t9;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/18 15:35
 * @Desc：
 */
public class MyThread1 extends Thread {
    private MyOneList list;

    @Override
    public void run() {
        MyService myRef = new MyService();
        myRef.addServiceMethod(list, "A");
    }

    public MyThread1(MyOneList list) {
        super();
        this.list = list;
    }
}
