package main.java.com.mydesign.Decorator.demo2;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/13 18:58
 * @Desc：
 */
public class ConcreteComponent  implements Component {
    public ConcreteComponent() {
        System.out.println("创建具体构件角色");
    }
    public void operation() {
        System.out.println("调用具体构件角色的方法operation()");
    }
}
