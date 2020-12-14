package com.mydesign.Decorator.demo2;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/13 18:58
 * @Desc：
 */
public class DecoratorPattern {
    public static void main(String[] args) {
        Component p = new ConcreteComponent();
        p.operation();
        System.out.println("---------------------------------");
        Component d = new ConcreteDecorator(p);
        d.operation();
    }
}
