package com.mydesign.Interpreter.demo1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/14 15:10
 * @Desc：
 */
public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
