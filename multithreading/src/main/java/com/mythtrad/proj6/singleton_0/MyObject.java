package com.mythtrad.proj6.singleton_0;

/**
 * @Author：Yerik Xiang
 * @Date：2020/10/19 15:09
 * @Desc：
 */
public class MyObject {
    private static MyObject myObject = new MyObject();

    public MyObject() {
    }

    public static MyObject getInstance() {
        return myObject;
    }
}
