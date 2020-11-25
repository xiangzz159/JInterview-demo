package com.mydesign.Factory.FactoryMethod;


/**
 * @Author：Yerik Xiang
 * @Date：2020/11/25 10:19
 * @Desc：
 */
public class Rectangle implements Shape {
    public Rectangle() {
        this.draw();
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
