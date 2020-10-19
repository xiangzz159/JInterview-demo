package com.mythtrad.proj6.singleton_7;

/**
 * @Author：Yerik Xiang
 * @Date：2020/10/19 15:12
 * @Desc：另一种解决方法：内嵌类
 */
public class MyObject {
    private static class MyObjectHandler {
        private static com.mythtrad.proj6.singleton_7_1.MyObject myObject = new com.mythtrad.proj6.singleton_7_1.MyObject();
    }

    public MyObject() {
    }

    public static com.mythtrad.proj6.singleton_7_1.MyObject getInstance() {
        return MyObjectHandler.myObject;
    }
}
