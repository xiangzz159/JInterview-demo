package com.mydesign.prototype.demo1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/11/23 10:58
 * @Desc：
 */
public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
