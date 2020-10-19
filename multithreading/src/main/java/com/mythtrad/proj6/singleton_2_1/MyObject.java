package com.mythtrad.proj6.singleton_2_1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/10/19 15:12
 * @Desc：
 */
public class MyObject {
    private static MyObject myObject;

    public MyObject() {
    }

    synchronized public static MyObject getInstance() {
        try {
            if (myObject == null) {
                Thread.sleep(3000);
                myObject = new MyObject();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }
}
