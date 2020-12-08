package com.mydesign.State.demo1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/8 15:49
 * @Desc：
 */
public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }
    @Override
    public String toString(){
        return "Start State";
    }
}
