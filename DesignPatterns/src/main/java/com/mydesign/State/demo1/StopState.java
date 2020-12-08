package com.mydesign.State.demo1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/8 15:50
 * @Desc：
 */
public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }
    @Override
    public String toString(){
        return "Stop State";
    }
}
