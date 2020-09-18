package com.mythtrad.proj2.t9;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/18 15:34
 * @Desc：去掉synchronized (list)会出现脏读
 */
public class MyService {
    public MyOneList addServiceMethod(MyOneList list, String data) {
        try {
            synchronized (list) {
                if (list.getSize() < 1) {
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(2000);
                    list.add(data);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return list;
    }
}
