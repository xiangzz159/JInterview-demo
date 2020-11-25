package com.mydesign.Factory.SimpleFactory;

/**
 * @Author：Yerik Xiang
 * @Date：2020/11/25 10:19
 * @Desc：
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
