package com.mydesign.Interpreter.demo2;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/14 15:43
 * @Desc：
 */
public class TerminalExpression implements Expression {
    private Set<String> set = new HashSet<String>();
    public TerminalExpression(String[] data) {
        for (int i = 0; i < data.length; i++) set.add(data[i]);
    }
    public boolean interpret(String info) {
        if (set.contains(info)) {
            return true;
        }
        return false;
    }
}
