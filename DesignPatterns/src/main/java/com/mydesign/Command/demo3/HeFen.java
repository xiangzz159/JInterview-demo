package com.mydesign.Command.demo3;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/9 23:06
 * @Desc：
 */
public class HeFen implements Breakfast {
    private HeFenChef receiver;
    HeFen() {
        receiver = new HeFenChef();
    }
    @Override
    public void cooking() {
        receiver.cooking();
    }
}
