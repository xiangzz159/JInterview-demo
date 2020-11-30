package com.mydesign.Strategy.demo1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/11/30 17:06
 * @Desc：
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
