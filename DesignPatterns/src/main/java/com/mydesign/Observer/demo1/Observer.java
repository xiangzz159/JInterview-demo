package com.mydesign.Observer.demo1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/9 16:13
 * @Desc：
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
