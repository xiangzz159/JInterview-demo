package com.mythtrad.proj2.syn_Out_asyn;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/18 15:25
 * @Desc：
 */
public class Test {
    public static void main(String[] args) {
        MyList myList = new MyList();
        MyThreadA a = new MyThreadA(myList);
        MyThreadB b = new MyThreadB(myList);
        a.setName("A");
        b.setName("B");
        a.start();
        b.start();
    }
}
