package com.mydesign.Bridger.demo1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/13 13:04
 * @Desc：
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
