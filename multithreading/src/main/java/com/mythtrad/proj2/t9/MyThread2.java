package com.mythtrad.proj2.t9;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/18 15:35
 * @Desc：
 */
public class MyThread2 extends Thread {
    private MyOneList list;

    @Override
    public void run() {
        MyService myRef = new MyService();
        myRef.addServiceMethod(list, "B");
    }

    public MyThread2(MyOneList list) {
        super();
        this.list = list;
    }
}
