package com.mydesign.Factory.FactoryMethod;


/**
 * @Author：Yerik Xiang
 * @Date：2020/11/25 10:19
 * @Desc：
 */
public class Square implements Shape {
    public Square() {
        this.draw();
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
