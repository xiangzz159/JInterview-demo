package main.java.com.mydesign.Visitor.demo2;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/11 23:50
 * @Desc：
 */
public class ConcreteVisitorB implements Visitor {
    public void visit(ConcreteElementA element) {
        System.out.println("具体访问者B访问-->" + element.operationA());
    }
    public void visit(ConcreteElementB element) {
        System.out.println("具体访问者B访问-->" + element.operationB());
    }
}
