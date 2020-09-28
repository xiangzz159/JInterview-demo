package com.mythtrad.proj3.pipeInputOutput;

import java.io.PipedInputStream;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/25 13:41
 * @Desc：
 */
public class ThreadRead extends Thread {
    private ReadData read;
    private PipedInputStream input;

    public ThreadRead(ReadData read, PipedInputStream input) {
        this.read = read;
        this.input = input;
    }

    @Override
    public void run() {
        read.readMethod(input);
    }
}
