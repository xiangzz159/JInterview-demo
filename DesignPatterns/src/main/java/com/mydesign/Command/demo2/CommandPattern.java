package com.mydesign.Command.demo2;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/1 16:30
 * @Desc：
 */
public class CommandPattern {
    public static void main(String[] args) {
        Command cmd = new ConcreteCommand();
        Invoker ir = new Invoker(cmd);
        System.out.println("客户访问调用者的call()方法...");
        ir.call();
    }
}
