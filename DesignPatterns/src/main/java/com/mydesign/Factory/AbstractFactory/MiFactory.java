package com.mydesign.Factory.AbstractFactory;

/**
 * @Author：Yerik Xiang
 * @Date：2020/11/25 14:45
 * @Desc：
 */
public class MiFactory implements AbstractFactory {
    @Override
    public PC makePC() {
        return new MiPC();
    }

    @Override
    public Phone makePhone() {
        return new MiPhone();
    }
}
