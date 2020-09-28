package com.mythtrad.proj3.pipeReaderWriter;


import java.io.PipedOutputStream;
import java.io.PipedWriter;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/25 13:39
 * @Desc：
 */
public class ThreadWrite extends Thread {
    private WriteData writeData;
    private PipedWriter out;
    public ThreadWrite(WriteData writeData, PipedWriter out) {
        this.writeData = writeData;
        this.out = out;
    }

    @Override
    public void run() {
        writeData.writeMethod(out);
    }
}
