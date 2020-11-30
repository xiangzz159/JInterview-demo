package com.mydesign.Strategy.demo1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/11/30 17:05
 * @Desc：
 */
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
