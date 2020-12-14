package com.mydesign.Memento.demo1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/14 10:58
 * @Desc：
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
