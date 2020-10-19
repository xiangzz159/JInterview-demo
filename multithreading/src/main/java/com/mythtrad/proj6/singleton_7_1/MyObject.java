package com.mythtrad.proj6.singleton_7_1;

import java.io.ObjectStreamException;

/**
 * @Author：Yerik Xiang
 * @Date：2020/10/19 15:12
 * @Desc：
 */
public class MyObject {
    private static final long serialVersionUID = 888L;
    private static class MyObjectHandler {
        // 内嵌类
        private static MyObject myObject = new MyObject();
    }

    public MyObject() {
    }

    public static MyObject getInstance() {
        return MyObjectHandler.myObject;
    }

    protected Object readResolve() throws ObjectStreamException {
        System.out.println("调用了readResolve方法!");
        return MyObjectHandler.myObject;
    }
}
