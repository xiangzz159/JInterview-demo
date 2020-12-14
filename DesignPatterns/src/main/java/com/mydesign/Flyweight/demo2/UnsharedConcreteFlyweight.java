package com.mydesign.Flyweight.demo2;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/14 18:05
 * @Desc：
 */
public class UnsharedConcreteFlyweight {
    private String info;
    UnsharedConcreteFlyweight(String info) {
        this.info = info;
    }
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }
}
