package main.java.com.mydesign.Adapter.demo3;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/13 12:47
 * @Desc：目标实现
 */
public class TargetRealize implements TwoWayTarget {
    public void request()
    {
        System.out.println("目标代码被调用！");
    }
}
