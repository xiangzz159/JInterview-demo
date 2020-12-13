package main.java.com.mydesign.Bridger.demo1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/13 13:04
 * @Desc：
 */
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
