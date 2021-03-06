package com.mydesign.Flyweight.demo1;

import java.util.HashMap;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/14 17:47
 * @Desc：
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<String, Shape>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle)circleMap.get(color);

        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
