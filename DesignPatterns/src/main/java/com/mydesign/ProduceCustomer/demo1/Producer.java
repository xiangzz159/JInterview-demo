package com.mydesign.ProduceCustomer.demo1;

/**
 * @Author：Yerik Xiang
 * @Date：2021/5/11 15:39
 * @Desc：
 */
public class Producer extends Thread {
    private Buffer buffer;
    private int number;

    public Producer(Buffer b, int number) {
        buffer = b;
        this.number = number;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                sleep(500);
            } catch (InterruptedException e) {}
            buffer.put(i);
            System.out.println("生产者 #" + this.number + " put: " + i);
        }
    }


}
