package com.mydesign.Memento.demo2;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/14 11:44
 * @Desc：
 */
public class PrototypeCaretaker {
    private OriginatorPrototype opt;
    public void setMemento(OriginatorPrototype opt) {
        this.opt = opt;
    }
    public OriginatorPrototype getMemento() {
        return opt;
    }
}
