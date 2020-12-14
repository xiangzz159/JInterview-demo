package com.mydesign.Memento.demo1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/14 10:58
 * @Desc：
 */
public class Originator {
    private String state;

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento Memento){
        state = Memento.getState();
    }
}
