package com.mydesign.Factory.FactoryMethod;

/**
 * @Author：Yerik Xiang
 * @Date：2020/11/25 10:21
 * @Desc：
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new CircleFactory();
        shapeFactory.getShape();

        shapeFactory = new SquareFactory();
        shapeFactory.getShape();

        shapeFactory = new RectangleFactory();
        shapeFactory.getShape();
    }
}
