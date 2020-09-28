package com.mythtrad.proj3.p_r_test;


/**
 * @Author：Yerik Xiang
 * @Date：2020/9/25 09:55
 * @Desc：
 */
public class P {
    private String lock;

    public P(String lock) {
        this.lock = lock;
    }
    public void setValue() {
        try {
            synchronized (lock) {
                if (!ValueObject.value.equals("")) {
                    lock.wait();
                }
                String value = System.currentTimeMillis() + "_" + System.nanoTime();
                System.out.println("set的值是 " + value);
                ValueObject.value = value;
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
