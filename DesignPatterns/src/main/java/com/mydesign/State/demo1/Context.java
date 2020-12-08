package com.mydesign.State.demo1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/8 15:48
 * @Desc：
 */
public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
