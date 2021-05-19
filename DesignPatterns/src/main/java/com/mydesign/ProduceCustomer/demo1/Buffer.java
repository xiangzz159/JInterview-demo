package com.mydesign.ProduceCustomer.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author：Yerik Xiang
 * @Date：2021/5/11 15:34
 * @Desc：
 */
public class Buffer {
    private List<Integer> data = new ArrayList<Integer>();
    private static final int MAX = 10;
    private static final int MIN = 0;

    public synchronized int get() {
        while (MIN == data.size()) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        Integer i = data.remove(0);
        notifyAll();
        return i;
    }

    public synchronized  void put(int value) {
        while (MAX == data.size()) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        data.add(value);
        notifyAll();
    }
}
