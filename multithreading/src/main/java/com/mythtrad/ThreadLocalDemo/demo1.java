package com.mythtrad.ThreadLocalDemo;

/**
 * @Author：Yerik Xiang
 * @Date：2021/5/13 11:09
 * @Desc：
 */
public class demo1 {
    private static ThreadLocal<Integer> num = new ThreadLocal<Integer>() {
        @Override
        protected Integer initialValue() {
            return 0;
        }
    };


    public static void main(String[] args) {
        new Thread(new Runnable() {
            public void run() {
                num.set(1);
                System.out.println("一号线程中ThreadLocal变量中保存的值为：" + num.get());
            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                num.set(2);
                System.out.println("二号线程中ThreadLocal变量中保存的值为：" + num.get());
            }
        }).start();

        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Main线程中ThreadLocal变量中保存的值为：" + num.get());
    }
}
