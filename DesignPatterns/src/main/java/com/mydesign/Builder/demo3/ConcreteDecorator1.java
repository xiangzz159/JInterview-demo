package main.java.com.mydesign.Builder.demo3;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/9 22:42
 * @Desc：
 */
public class ConcreteDecorator1 extends Decorator {
    public void buildWall() {
        product.setWall("w1");
    }
    public void buildTV() {
        product.setTV("TV1");
    }
    public void buildSofa() {
        product.setSofa("sf1");
    }
}
