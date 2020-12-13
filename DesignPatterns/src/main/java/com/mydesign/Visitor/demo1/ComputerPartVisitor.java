package main.java.com.mydesign.Visitor.demo1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/11 23:12
 * @Desc：
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
