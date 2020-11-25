package com.mydesign.Factory.SimpleFactory;

/**
 * @Author：Yerik Xiang
 * @Date：2020/11/25 10:19
 * @Desc：
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
