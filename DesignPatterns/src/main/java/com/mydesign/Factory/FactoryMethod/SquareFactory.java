package com.mydesign.Factory.FactoryMethod;

/**
 * @Author：Yerik Xiang
 * @Date：2020/11/25 14:16
 * @Desc：
 */
public class SquareFactory implements ShapeFactory {
    @Override
    public Shape getShape() {
        return new Square();
    }
}
