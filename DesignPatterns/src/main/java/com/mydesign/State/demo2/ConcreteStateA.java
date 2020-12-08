package com.mydesign.State.demo2;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/8 17:12
 * @Desc：
 */
public class ConcreteStateA extends State {
    @Override
    public void Handle(Context context) {
        System.out.println("当前状态是 A.");
        context.setState(new ConcreteStateB());
    }
}
