package com.mythtrad.proj3.pipeReaderWriter;


import java.io.PipedInputStream;
import java.io.PipedReader;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/25 13:41
 * @Desc：
 */
public class ThreadRead extends Thread {
    private ReadData read;
    private PipedReader input;

    public ThreadRead(ReadData read, PipedReader input) {
        this.read = read;
        this.input = input;
    }

    @Override
    public void run() {
        read.readMethod(input);
    }
}
