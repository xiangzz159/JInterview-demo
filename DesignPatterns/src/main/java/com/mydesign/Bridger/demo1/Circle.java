package com.mydesign.Bridger.demo1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/13 13:04
 * @Desc：
 */
public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
