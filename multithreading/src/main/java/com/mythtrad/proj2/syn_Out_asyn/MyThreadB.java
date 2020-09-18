package com.mythtrad.proj2.syn_Out_asyn;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/18 15:23
 * @Desc：
 */
public class MyThreadB extends Thread {
    private MyList list;

    public MyThreadB(MyList list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            list.add("threadB" + (i + 1));
        }
    }
}
