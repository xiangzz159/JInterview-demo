package com.mydesign.Factory.FactoryMethod;


/**
 * @Author：Yerik Xiang
 * @Date：2020/11/25 10:19
 * @Desc：
 */
public class Circle implements Shape {
    public Circle() {
        this.draw();
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
