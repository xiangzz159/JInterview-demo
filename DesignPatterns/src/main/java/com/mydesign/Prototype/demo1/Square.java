package com.mydesign.Prototype.demo1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/11/23 10:58
 * @Desc：
 */
public class Square extends Shape {
    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
