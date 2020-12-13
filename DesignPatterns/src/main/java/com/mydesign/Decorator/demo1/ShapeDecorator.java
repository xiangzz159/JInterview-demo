package main.java.com.mydesign.Decorator.demo1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/13 18:45
 * @Desc：
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
