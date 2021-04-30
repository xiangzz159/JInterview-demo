package com.mydesign.Proxy.demo4;


/**
 * @Author：Yerik Xiang
 * @Date：2021/4/30 14:54
 * @Desc：动态代理
 * 优点
 * 可以使真实对象的操作更加纯粹！不用去关注一些公共的业务
 * 公共业务交给代理角色，实现了业务的分工
 * 公共业务发生扩展的时候，方便集中管理
 * 一个动态代理类是一个接口，一般就是对应的一类业务
 * 一个动态代理类可以代理多个类，只要是实现了同一个接口即可
 */
public class Client {
    public static void main(String[] args) {
        // 真实角色
        Host host = new Host();
        // 代理角色
        ProxyInvocationHandler handler = new ProxyInvocationHandler();
        // 通过调用程序处理角色来处理我们要调用的接口对象

        handler.setRent(host);
        Rent proxy = (Rent) handler.getProxy();
        proxy.rent();
    }
}
