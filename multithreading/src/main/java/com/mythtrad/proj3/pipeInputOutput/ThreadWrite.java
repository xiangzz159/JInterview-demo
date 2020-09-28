package com.mythtrad.proj3.pipeInputOutput;

import java.io.PipedOutputStream;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/25 13:39
 * @Desc：
 */
public class ThreadWrite extends Thread {
    private WriteData writeData;
    private PipedOutputStream out;
    public ThreadWrite(WriteData writeData, PipedOutputStream out) {
        this.writeData = writeData;
        this.out = out;
    }

    @Override
    public void run() {
        writeData.writeMethod(out);
    }
}
