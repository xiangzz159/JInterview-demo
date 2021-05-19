package com.mydesign.ProduceCustomer.demo1;


/**
 * @Author：Yerik Xiang
 * @Date：2021/5/11 15:32
 * @Desc：
 */
public class Consumer extends Thread {
    private Buffer buffer;
    private int number;

    public Consumer(Buffer b, int number) {
        buffer = b;
        this.number = number;
    }

    public void run() {
        int value;
        for (int i = 0; i < 10; i++) {
            value = buffer.get();
            try {
                sleep(1000);
            } catch (InterruptedException e) {}
            System.out.println("消费者 #" + this.number + " got: " + value);
        }
    }
}
