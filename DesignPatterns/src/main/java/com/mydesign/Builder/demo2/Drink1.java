package com.mydesign.Builder.demo2;

/**
 * @Author：Yerik Xiang
 * @Date：2020/11/25 17:21
 * @Desc：
 */
public class Drink1 extends Drink {
    @Override
    public float getPrice() {
        return 5f;
    }

    @Override
    public String getName() {
        return "可乐";
    }
}
