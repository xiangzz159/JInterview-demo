package com.mydesign.Factory.AbstractFactory;

/**
 * @Author：Yerik Xiang
 * @Date：2020/11/25 14:47
 * @Desc：
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory miFactory = new MiFactory();
        AbstractFactory appleFactory = new AppleFactory();
        miFactory.makePC();
        miFactory.makePhone();
        appleFactory.makePC();
        appleFactory.makePhone();
    }
}
