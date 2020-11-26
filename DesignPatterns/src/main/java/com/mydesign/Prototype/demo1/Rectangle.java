package com.mydesign.Prototype.demo1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/11/23 10:55
 * @Desc：
 */
public class Rectangle extends Shape {
    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
