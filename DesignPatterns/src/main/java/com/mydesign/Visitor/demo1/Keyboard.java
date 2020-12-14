package com.mydesign.Visitor.demo1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/11 23:10
 * @Desc：
 */
public class Keyboard implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
