package main.java.com.mydesign.Visitor.demo2;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/11 23:51
 * @Desc：
 */
public class ConcreteElementA implements Element{
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    public String operationA() {
        return "具体元素A的操作。";
    }
}
