package com.mydesign.Factory.AbstractFactory;

/**
 * @Author：Yerik Xiang
 * @Date：2020/11/25 14:43
 * @Desc：
 */
public class Mac implements PC {
    public Mac() {
        this.make();
    }

    @Override
    public void make() {
        System.out.println("Make Apple Mac");
    }
}
