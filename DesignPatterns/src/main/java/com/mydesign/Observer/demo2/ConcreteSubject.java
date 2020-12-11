package com.mydesign.Observer.demo2;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/9 16:57
 * @Desc：
 */
public class ConcreteSubject extends Subject {
    @Override
    public void notifyObserver() {
        System.out.println("具体目标发生改变...");
        System.out.println("--------------");
        for (Object obs : observers) {
            ((Observer) obs).response();
        }
    }
}
