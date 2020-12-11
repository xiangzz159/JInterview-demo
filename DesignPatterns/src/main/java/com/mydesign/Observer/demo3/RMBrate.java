package com.mydesign.Observer.demo3;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/9 17:39
 * @Desc：
 */
public class RMBrate extends Rate {
    @Override
    public void change(int number) {
        for (Company obs : companys) {
            ((Company) obs).response(number);
        }
    }
}
