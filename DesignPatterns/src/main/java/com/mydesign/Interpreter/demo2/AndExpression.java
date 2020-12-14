package com.mydesign.Interpreter.demo2;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/14 15:43
 * @Desc：
 */
public class AndExpression implements Expression {
    private Expression city = null;
    private Expression person = null;
    public AndExpression(Expression city, Expression person) {
        this.city = city;
        this.person = person;
    }
    public boolean interpret(String info) {
        String s[] = info.split("的");
        return city.interpret(s[0]) && person.interpret(s[1]);
    }
}
