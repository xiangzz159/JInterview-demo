package com.mydesign.builder.demo2;

/**
 * @Author：Yerik Xiang
 * @Date：2020/11/25 17:18
 * @Desc：
 */
public abstract class Drink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float getPrice();
}
