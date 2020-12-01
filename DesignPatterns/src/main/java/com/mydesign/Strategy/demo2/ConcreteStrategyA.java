package com.mydesign.Strategy.demo2;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/1 16:34
 * @Desc：
 */
public class ConcreteStrategyA implements Strategy {
    @Override
    public void strategyMethod() {
        System.out.println("具体策略A的策略方法被访问！");
    }
}
