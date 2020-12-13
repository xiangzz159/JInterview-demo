package main.java.com.mydesign.Adapter.demo2;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/13 12:35
 * @Desc：
 */
public class ElectricAdapter implements Motor {
    private ElectricMotor emotor;
    public ElectricAdapter()
    {
        emotor=new ElectricMotor();
    }
    @Override
    public void drive()
    {
        emotor.electricDrive();
    }
}
