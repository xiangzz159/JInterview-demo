package com.mydesign.Observer.demo2;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/9 16:58
 * @Desc：
 */
public class ConcreteObserver2 implements Observer {
    @Override
    public void response() {
        System.out.println("具体观察者2作出反应！");
    }
}
