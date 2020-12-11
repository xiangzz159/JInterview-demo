package com.mydesign.Command.demo3;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/9 23:05
 * @Desc：
 */
public class ChangFen implements Breakfast {
    private ChangFenChef receiver;
    ChangFen() {
        receiver = new ChangFenChef();
    }
    @Override
    public void cooking() {
        receiver.cooking();
    }}
