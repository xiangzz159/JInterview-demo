package com.mythtrad.proj3.wait_notify_size5;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/23 10:00
 * @Desc：
 */
public class MyList {
    private static List list = new ArrayList();
    public static void add() {
        list.add("str");
    }
    public static int size() {
        return list.size();
    }
}
