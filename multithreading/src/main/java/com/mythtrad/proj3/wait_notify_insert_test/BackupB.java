package com.mythtrad.proj3.wait_notify_insert_test;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/25 14:17
 * @Desc：
 */
public class BackupB extends Thread {
    private DBTools dbTools;

    public BackupB(DBTools dbTools) {
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        dbTools.backupB();
    }
}
