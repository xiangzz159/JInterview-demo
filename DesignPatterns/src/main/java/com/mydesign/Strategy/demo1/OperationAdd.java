package com.mydesign.Strategy.demo1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/11/30 10:11
 * @Desc：
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
