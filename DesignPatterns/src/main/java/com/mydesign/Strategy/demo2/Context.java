package com.mydesign.Strategy.demo2;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/1 16:33
 * @Desc：
 */
public class Context {
    private Strategy strategy;
    public Strategy getStrategy() {
        return strategy;
    }
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    public void strategyMethod() {
        strategy.strategyMethod();
    }
}
