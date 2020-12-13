package main.java.com.mydesign.Bridger.demo1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/13 13:05
 * @Desc：
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
