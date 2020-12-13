package main.java.com.mydesign.Visitor.demo2;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/11 23:51
 * @Desc：
 */
public class ConcreteElementB implements Element{
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    public String operationB() {
        return "具体元素B的操作。";
    }
}
