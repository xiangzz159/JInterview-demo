package com.mythtrad.proj3.waitOld;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/24 16:10
 * @Desc：
 */
public class Subtract {
    private String lock;

    public Subtract(String lock) {
        this.lock = lock;
    }
    public void subtract() {
        try {
            synchronized (lock) {
//                if (Add.list.size() == 0) {
                while (Add.list.size() == 0) {
                    System.out.println("wait begin ThreadName=" + Thread.currentThread().getName());
                    lock.wait();
                    System.out.println("wait end ThreadName=" + Thread.currentThread().getName());
                }
                Add.list.remove(0);
                System.out.println("list size=" + Add.list.size());
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
