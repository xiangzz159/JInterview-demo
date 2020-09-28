package com.mythtrad.proj3.p_c_allWait;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/25 10:10
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
                while (!ValueObject.value.equals("")) {
                    lock.wait();
                }
                System.out.println("生产者 " + Thread.currentThread().getName() + " RUNNABLE了");
                String value = System.currentTimeMillis() + "_" + System.nanoTime();
                ValueObject.value = value;
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

