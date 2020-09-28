package com.mythtrad.proj3.stack_1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/25 10:55
 * @Desc：
 */
public class Run {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        P p = new P(myStack);
        C r = new C(myStack);
        P_Thread p_thread = new P_Thread(p);
        C_Thread c_thread = new C_Thread(r);
        p_thread.start();
        c_thread.start();
    }
}
