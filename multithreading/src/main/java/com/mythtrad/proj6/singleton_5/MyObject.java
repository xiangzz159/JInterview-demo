package com.mythtrad.proj6.singleton_5;

/**
 * @Author：Yerik Xiang
 * @Date：2020/10/19 15:12
 * @Desc：双重检查锁(DCL)
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
                    if (myObject == null) {
                        myObject = new MyObject();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }
}
