package main.java.com.mydesign.Adapter.demo2;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/13 12:36
 * @Desc：
 */
public class OpticalAdapter implements Motor {
    private OpticalMotor omotor;
    public OpticalAdapter()
    {
        omotor=new OpticalMotor();
    }
    @Override
    public void drive()
    {
        omotor.opticalDrive();
    }
}
