package com.mydesign.Adapter.demo3;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/13 12:47
 * @Desc：适配者实现
 */
public class AdapteeRealize implements TwoWayAdaptee {
    public void specificRequest()
    {
        System.out.println("适配者代码被调用！");
    }
}
