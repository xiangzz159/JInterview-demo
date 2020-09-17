package com.mythtrad.proj1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/16 13:25
 * @Desc：
 */
public class SuspendThread2 {
    private String username = "1";
    private String password = "11";
    public void setValue(String u, String p) {
        this.username = u;
        if (Thread.currentThread().getName().equals("a")) {
            System.out.println("停止a线程！");
            Thread.currentThread().suspend();
        }
        this.password = p;
    }

    public void printUsernamePassword() {
        System.out.println(username + " : " + password);
    }

    public static void main(String[] args) throws InterruptedException {
        final SuspendThread2 suspendThread2 = new SuspendThread2();
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                suspendThread2.setValue("a", "aa");
            }
        };
        thread1.setName("a");
        thread1.start();
        Thread.sleep(500);
        Thread thread2 = new Thread() {
            @Override
            public void run() {
                suspendThread2.printUsernamePassword();
            }
        };
        thread2.start();
    }
}
