package com.mythtrad.proj3.waitOld;

import com.sun.beans.decoder.ValueObject;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/24 16:08
 * @Desc：
 */
public class Add {
    private String lock;
    public static List list = new ArrayList();
    public Add(String lock) {
        this.lock = lock;
    }
    public void add() {
        synchronized (lock) {
            list.add("1");
            lock.notifyAll();
        }
    }
}
