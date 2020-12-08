package com.mydesign.State.demo4;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/8 17:53
 * @Desc：
 */
public class Dead extends ThreadState {
    public Dead() {
        stateName = "死亡状态";
        System.out.println("当前线程处于：死亡状态.");
    }
}
