package com.mydesign.Strategy.demo2;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/1 16:34
 * @Desc：
 */
public class ConcreteStrategyB implements Strategy {
    @Override
    public void strategyMethod() {
        System.out.println("具体策略B的策略方法被访问！");
    }
}
