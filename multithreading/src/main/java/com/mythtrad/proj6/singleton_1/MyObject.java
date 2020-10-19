package com.mythtrad.proj6.singleton_1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/10/19 15:12
 * @Desc：
 */
public class MyObject {
    private static MyObject myObject;

    public MyObject() {
    }

    public static MyObject getInstance() {
        if (myObject == null) {
            myObject = new MyObject();
        }
        return myObject;
    }
}
