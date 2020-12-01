package com.mydesign.Strategy.demo2;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/1 16:35
 * @Desc：
 */
public class StrategyPattern {
    public static void main(String[] args) {
        Context c = new Context();
        Strategy s = new ConcreteStrategyA();
        c.setStrategy(s);
        c.strategyMethod();
        System.out.println("-----------------");
        s = new ConcreteStrategyB();
        c.setStrategy(s);
        c.strategyMethod();
    }
}
