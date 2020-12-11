package com.mydesign.Builder.demo3;
/**
 * @Author：Yerik Xiang
 * @Date：2020/12/9 22:42
 * @Desc：
 */
public class ConcreteDecorator2 extends Decorator {
    @Override
    public void buildWall() {
        product.setWall("w2");
    }
    @Override
    public void buildTV() {
        product.setTV("TV2");
    }
    @Override
    public void buildSofa() {
        product.setSofa("sf2");
    }
}
