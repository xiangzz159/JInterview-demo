package com.mythtrad.proj2.syn_Out_asyn;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/18 15:23
 * @Desc：
 */
public class MyThreadA extends Thread {
    private MyList list;

    public MyThreadA(MyList list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            list.add("threadA" + (i + 1));
        }
    }
}
