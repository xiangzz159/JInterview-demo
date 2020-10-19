package com.mythtrad.proj6.singleton_3;

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
        try {
            if (myObject == null) {
                Thread.sleep(3000);
                synchronized (MyObject.class) {
                    myObject = new MyObject();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }
}
