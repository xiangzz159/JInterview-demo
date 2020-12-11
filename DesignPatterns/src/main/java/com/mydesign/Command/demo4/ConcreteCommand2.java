package com.mydesign.Command.demo4;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/9 23:12
 * @Desc：
 */
public class ConcreteCommand2 implements AbstractCommand {
    private CompositeReceiver receiver;
    ConcreteCommand2() {
        receiver = new CompositeReceiver();
    }
    @Override
    public void execute() {
        receiver.action2();
    }
}
