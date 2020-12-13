package main.java.com.mydesign.Facade.demo2;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/13 20:19
 * @Desc：
 */
public class Facade {
    private SubSystem01 obj1 = new SubSystem01();
    private SubSystem02 obj2 = new SubSystem02();
    private SubSystem03 obj3 = new SubSystem03();
    public void method() {
        obj1.method1();
        obj2.method2();
        obj3.method3();
    }
}
