package main.java.com.mydesign.Facade.demo1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/13 19:44
 * @Desc：
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
