package main.java.com.mydesign.Builder.demo3;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/9 22:41
 * @Desc：
 */
public abstract class Decorator {
    protected  Parlour product = new Parlour();
    public abstract void buildWall();
    public abstract void buildTV();
    public abstract void buildSofa();
    public Parlour getResult() {
        return product;
    }
}
