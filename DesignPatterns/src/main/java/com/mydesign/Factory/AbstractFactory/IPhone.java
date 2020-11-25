package com.mydesign.Factory.AbstractFactory;

/**
 * @Author：Yerik Xiang
 * @Date：2020/11/25 14:42
 * @Desc：
 */
public class IPhone implements Phone {
    public IPhone() {
        this.make();
    }

    @Override
    public void make() {
        System.out.println("Make IPhone");
    }
}
