package com.mythtrad.proj3.wait_notify_insert_test;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/25 14:17
 * @Desc：
 */
public class Run {
    public static void main(String[] args) {
        DBTools dbTools = new DBTools();
        for (int i = 0; i < 20; i++) {
            BackupB output = new BackupB(dbTools);
            output.start();
            BackupA input = new BackupA(dbTools);
            input.start();
        }
    }
}
