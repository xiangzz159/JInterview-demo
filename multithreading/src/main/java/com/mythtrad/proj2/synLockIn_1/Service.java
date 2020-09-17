package com.mythtrad.proj2.synLockIn_1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/17 13:19
 * @Desc：
 */
public class Service {
    synchronized public void service1() {
        System.out.println("service1");
        service2();
    }
    synchronized public void service2() {
        System.out.println("service2");
        service3();
    }
    synchronized public void service3() {
        System.out.println("service3");
    }
}
