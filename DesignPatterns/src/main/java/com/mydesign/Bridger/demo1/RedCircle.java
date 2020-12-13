package main.java.com.mydesign.Bridger.demo1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/13 13:03
 * @Desc：
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
