package com.mythtrad.proj2.t9;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/18 15:33
 * @Desc：
 */
public class MyOneList {
    private List list = new ArrayList();
    synchronized public void add(String data) {
        list.add(data);
    }
    synchronized public int getSize() {
        return list.size();
    }
}
