package main.java.com.mydesign.Builder.demo3;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/9 22:42
 * @Desc：
 */
public class ConcreteDecorator2 extends Decorator {
    public void buildWall() {
        product.setWall("w2");
    }
    public void buildTV() {
        product.setTV("TV2");
    }
    public void buildSofa() {
        product.setSofa("sf2");
    }
}
