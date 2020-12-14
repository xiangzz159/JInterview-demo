package com.mydesign.Memento.demo2;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/14 11:43
 * @Desc：
 */
public class OriginatorPrototype implements Cloneable {
    private String state;
    public void setState(String state) {
        this.state = state;
    }
    public String getState() {
        return state;
    }
    public OriginatorPrototype createMemento() {
        return this.clone();
    }
    public void restoreMemento(OriginatorPrototype opt) {
        this.setState(opt.getState());
    }
    @Override
    public OriginatorPrototype clone() {
        try {
            return (OriginatorPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
