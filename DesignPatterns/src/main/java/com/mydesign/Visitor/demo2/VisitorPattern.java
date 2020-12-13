package main.java.com.mydesign.Visitor.demo2;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/11 23:49
 * @Desc：
 */
public class VisitorPattern {
    public static void main(String[] args) {
        ObjectStructure os = new ObjectStructure();
        os.add(new ConcreteElementA());
        os.add(new ConcreteElementB());
        Visitor visitor = new ConcreteVisitorA();
        os.accept(visitor);
        System.out.println("------------------------");
        visitor = new ConcreteVisitorB();
        os.accept(visitor);
    }
}
