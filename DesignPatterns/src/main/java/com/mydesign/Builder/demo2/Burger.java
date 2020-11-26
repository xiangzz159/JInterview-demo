package com.mydesign.Builder.demo2;

/**
 * @Author：Yerik Xiang
 * @Date：2020/11/25 17:17
 * @Desc：
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float getPrice();
}
