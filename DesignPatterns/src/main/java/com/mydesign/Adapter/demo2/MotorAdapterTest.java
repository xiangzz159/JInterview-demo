package main.java.com.mydesign.Adapter.demo2;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/13 12:36
 * @Desc：
 */
public class MotorAdapterTest {
    public static void main(String[] args)
    {
        System.out.println("适配器模式测试：");
        Motor motor=(Motor) ReadXML.getObject();
        motor.drive();
    }
}
