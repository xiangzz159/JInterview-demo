package com.stydy.proxy;

/**
 * @Author：Yerik Xiang
 * @Date：2021/4/30 14:54
 * @Desc：
 */
public class Proxy implements Rent {
    private Host host;
    public Proxy() {

    }

    public Proxy(Host host) {
        this.host = host;
    }

    public void rent() {
        seeHouse();
        host.rent();
        hetong();
        fare();
    }

    public void  seeHouse() {
        System.out.println("中介带你看房");
    }
    public void fare() {
        System.out.println("收中介费");
    }
    public void hetong() {
        System.out.println("签租借合同");
    }
}
