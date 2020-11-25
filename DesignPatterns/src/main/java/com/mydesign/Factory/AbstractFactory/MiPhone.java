package com.mydesign.Factory.AbstractFactory;

/**
 * @Author：Yerik Xiang
 * @Date：2020/11/25 14:41
 * @Desc：
 */
public class MiPhone implements Phone {
    public MiPhone() {
        this.make();
    }

    @Override
    public void make() {
        System.out.println("Make Xiaomi Phone");
    }
}
