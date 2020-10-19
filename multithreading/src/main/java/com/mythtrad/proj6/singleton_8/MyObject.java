package com.mythtrad.proj6.singleton_8;

public class MyObject {
    private static MyObject instance = null;

    public MyObject() {
    }
    static {
        instance = new MyObject();
    }

    public static MyObject getInstance() {
        return instance;
    }

}
