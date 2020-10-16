package com.mythtrad.proj4.ConditionTestManyToMany;


/**
 * @Author：Yerik Xiang
 * @Date：2020/9/29 10:13
 * @Desc：
 */
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        ThreadA[] threadA = new ThreadA[10];
        ThreadB[] threadB = new ThreadB[10];
        for (int i = 0; i < 10; i++) {
            threadA[i] = new ThreadA(myService);
            threadB[i] = new ThreadB(myService);
            threadA[i].start();
            threadB[i].start();
        }
    }
}
