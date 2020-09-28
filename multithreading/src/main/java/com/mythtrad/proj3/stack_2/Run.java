package com.mythtrad.proj3.stack_2;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/25 10:55
 * @Desc：
 */
public class Run {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        P p = new P(myStack);
        C r1 = new C(myStack);
        C r2 = new C(myStack);
        C r3 = new C(myStack);
        C r4 = new C(myStack);
        C r5 = new C(myStack);
        P_Thread p_thread = new P_Thread(p);
        p_thread.start();
        C_Thread c_thread1 = new C_Thread(r1);
        C_Thread c_thread2 = new C_Thread(r2);
        C_Thread c_thread3 = new C_Thread(r3);
        C_Thread c_thread4 = new C_Thread(r4);
        C_Thread c_thread5 = new C_Thread(r5);
        c_thread1.start();
        c_thread2.start();
        c_thread3.start();
        c_thread4.start();
        c_thread5.start();
    }
}
