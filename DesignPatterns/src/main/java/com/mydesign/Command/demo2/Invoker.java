package com.mydesign.Command.demo2;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/1 16:30
 * @Desc：
 */
public class Invoker {
    private Command command;
    public Invoker(Command command) {
        this.command = command;
    }
    public void setCommand(Command command) {
        this.command = command;
    }
    public void call() {
        System.out.println("调用者执行命令command...");
        command.execute();
    }
}
