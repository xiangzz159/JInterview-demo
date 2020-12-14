package com.mydesign.Mediator.demo2;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/11 22:24
 * @Desc：
 */
public class MediatorPattern {
    public static void main(String[] args) {
        Mediator md = new ConcreteMediator();
        Colleague c1, c2, c3;
        c1 = new ConcreteColleague1();
        c2 = new ConcreteColleague2();
        c3 = new ConcreteColleague3();
        md.register(c1);
        md.register(c2);
        md.register(c3);
        c1.send();
        System.out.println("-------------");
        c2.send();
        System.out.println("-------------");
        c3.send();
    }
}
