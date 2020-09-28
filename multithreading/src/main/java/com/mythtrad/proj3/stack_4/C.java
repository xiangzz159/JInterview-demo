package com.mythtrad.proj3.stack_4;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/25 10:51
 * @Desc：
 */
public class C {
    private MyStack myStack;

    public C(MyStack myStack) {
        this.myStack = myStack;
    }
    public void popService() {
        System.out.println("pop=" + myStack.pop());
    }
}
