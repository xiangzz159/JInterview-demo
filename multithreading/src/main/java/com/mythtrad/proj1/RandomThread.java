package com.mythtrad.proj1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/14 15:05
 * @Desc：
 */
public class RandomThread extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println(i + " run = " + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

//    public static void main(String[] args) {
//        try {
//            RandomThread randomThread = new RandomThread();
//            randomThread.setName("Random Thread");
//            randomThread.start();
//            for (int i = 0; i < 10; i++) {
//                int time = (int) (Math.random() * 1000);
//                Thread.sleep(time);
//                System.out.println(i + "run = " + Thread.currentThread().getName());
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }

    public static void main(String[] args) {
        try {
            for (int i = 0; i < 10; i++) {
                RandomThread randomThread = new RandomThread();
                randomThread.setName("Random Thread " + i);
                randomThread.start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
