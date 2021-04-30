package com.stydy.aop2;

/**
 * @Author：Yerik Xiang
 * @Date：2021/4/30 16:43
 * @Desc：
 */
public class DiyPointCut {
    public void before() {
        System.out.println("前置处理");
    }
    public void after() {
        System.out.println("后置处理");
    }

}
