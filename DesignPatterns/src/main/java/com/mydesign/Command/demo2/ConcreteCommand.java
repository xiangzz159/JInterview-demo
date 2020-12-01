package com.mydesign.Command.demo2;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/1 16:29
 * @Desc：
 */
public class ConcreteCommand implements Command {
    private Receiver receiver;
    ConcreteCommand() {
        receiver = new Receiver();
    }
    @Override
    public void execute() {
        receiver.action();
    }
}
