package com.mythtrad.proj3.wait_notify_insert_test;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/25 14:16
 * @Desc：
 */
public class BackupA extends Thread {
    private DBTools dbTools;

    public BackupA(DBTools dbTools) {
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        dbTools.backupA();
    }
}
