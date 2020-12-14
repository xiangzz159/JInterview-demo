package com.mydesign.Proxy.demo2;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/12 0:48
 * @Desc：
 */
public class RealSubject implements Subject {
    public void Request() {
        System.out.println("访问真实主题方法...");
    }
}
