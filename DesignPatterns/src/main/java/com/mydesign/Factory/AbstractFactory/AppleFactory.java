package com.mydesign.Factory.AbstractFactory;

/**
 * @Author：Yerik Xiang
 * @Date：2020/11/25 14:46
 * @Desc：
 */
public class AppleFactory implements AbstractFactory {
    @Override
    public PC makePC() {
        return new Mac();
    }

    @Override
    public Phone makePhone() {
        return new IPhone();
    }
}
