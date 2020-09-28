package com.mythtrad.proj3.stack_3;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/25 10:55
 * @Desc：
 */
public class Run {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        P p1 = new P(myStack);
        P p2 = new P(myStack);
        P p3 = new P(myStack);
        P p4 = new P(myStack);
        P p5 = new P(myStack);
        P p6 = new P(myStack);
        C r1 = new C(myStack);
        P_Thread p_thread1 = new P_Thread(p1);
        P_Thread p_thread2 = new P_Thread(p2);
        P_Thread p_thread3 = new P_Thread(p3);
        P_Thread p_thread4 = new P_Thread(p4);
        P_Thread p_thread5 = new P_Thread(p5);
        P_Thread p_thread6 = new P_Thread(p6);
        p_thread1.start();
        p_thread2.start();
        p_thread3.start();
        p_thread4.start();
        p_thread5.start();
        p_thread6.start();

        C_Thread c_thread1 = new C_Thread(r1);
        c_thread1.start();

    }
}
