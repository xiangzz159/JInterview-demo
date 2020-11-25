package com.mydesign.Factory.AbstractFactory;

/**
 * @Author：Yerik Xiang
 * @Date：2020/11/25 14:43
 * @Desc：
 */
public class MiPC implements PC {
    public MiPC() {
        this.make();
    }

    @Override
    public void make() {
        System.out.println("Make Xiaomi PC");
    }
}
