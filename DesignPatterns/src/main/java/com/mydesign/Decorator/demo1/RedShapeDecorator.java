package main.java.com.mydesign.Decorator.demo1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/13 18:45
 * @Desc：
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
