package com.mythtrad.proj2.t1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/16 15:17
 * @Desc：
 */
public class HasSelfPrivateNum {
    public void addI(String username) {
        try {
             int num = 0;
             if (username.equals("a")) {
                 num = 100;
                 System.out.println("a set over!");
                 Thread.sleep(2000);
             } else {
                 num = 200;
                 System.out.println("b set over!");
             }
            System.out.println(username + " : " + num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}