package com.mythtrad.proj3.p_c_allWait;


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
                while (ValueObject.value.equals("")) {
                    System.out.println("消费者 " + Thread.currentThread().getName() + " WAITING了");
                    lock.wait();
                }
                System.out.println("消费者 " + Thread.currentThread().getName() + " RUNNABLE了");
                ValueObject.value = "";
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
