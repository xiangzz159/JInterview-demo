package com.mythtrad.proj3.p_r_test;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/25 10:00
 * @Desc：
 */
public class C {
    private String lock;

    public C(String lock) {
        this.lock = lock;
    }
    public void getValue() {
        try {
            synchronized (lock) {
                if (ValueObject.value.equals("")) {
                    lock.wait();
                }
                System.out.println("get的值是 " + ValueObject.value);
                ValueObject.value = "";
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
