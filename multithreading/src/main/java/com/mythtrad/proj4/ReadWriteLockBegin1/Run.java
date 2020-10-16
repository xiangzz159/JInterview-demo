package com.mythtrad.proj4.ReadWriteLockBegin1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/10/15 17:27
 * @Desc：读写互斥、写写互斥、读读共享
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        threadA.start();
        Thread.sleep(1000);
        ThreadB threadB = new ThreadB(service);
        threadB.start();
    }
}
