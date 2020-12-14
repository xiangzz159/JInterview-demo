package com.mydesign.Adapter.demo3;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/13 12:47
 * @Desc：双向适配器
 */
public class TwoWayAdapter implements TwoWayAdaptee, TwoWayTarget {
    private TwoWayTarget target;
    private TwoWayAdaptee adaptee;
    public TwoWayAdapter(TwoWayTarget target)
    {
        this.target=target;
    }
    public TwoWayAdapter(TwoWayAdaptee adaptee)
    {
        this.adaptee=adaptee;
    }
    public void request()
    {
        adaptee.specificRequest();
    }
    public void specificRequest()
    {
        target.request();
    }
}
