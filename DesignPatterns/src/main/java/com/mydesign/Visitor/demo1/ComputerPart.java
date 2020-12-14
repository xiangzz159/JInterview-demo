package com.mydesign.Visitor.demo1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/11 23:10
 * @Desc：
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
