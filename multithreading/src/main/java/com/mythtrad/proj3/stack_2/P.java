package com.mythtrad.proj3.stack_2;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/25 10:51
 * @Desc：
 */
public class P {
    private MyStack myStack;

    public P(MyStack myStack) {
        this.myStack = myStack;
    }
    public void pushService() {
        myStack.push();
    }
}
