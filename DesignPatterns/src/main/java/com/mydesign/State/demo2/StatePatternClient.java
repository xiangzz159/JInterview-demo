package com.mydesign.State.demo2;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/8 17:13
 * @Desc：
 */
public class StatePatternClient {
    public static void main(String[] args) {
        Context context = new Context();    //创建环境
        context.Handle();    //处理请求
        context.Handle();
        context.Handle();
        context.Handle();
    }
}
