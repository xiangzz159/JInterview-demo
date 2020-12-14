package com.mydesign.Mediator.demo2;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/11 22:22
 * @Desc：
 */
public class ConcreteColleague1 extends Colleague {
    public void receive() {
        System.out.println("具体同事类1收到请求。");
    }
    public void send() {
        System.out.println("具体同事类1发出请求。");
        mediator.relay(this); //请中介者转发
    }
}
