package com.stydy.proxy;


/**
 * @Author：Yerik Xiang
 * @Date：2021/4/30 14:54
 * @Desc：静态代理
 * 优点
 * 可以使真实对象的操作更加纯粹！不用去关注一些公共的业务
 * 公共业务交给代理角色，实现了业务的分工
 * 公共业务发生扩展的时候，方便集中管理
 * 缺点：
 * 一个真实角色就会产生一个代理角色；代码量会翻倍（降低开发效率
 */
public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
