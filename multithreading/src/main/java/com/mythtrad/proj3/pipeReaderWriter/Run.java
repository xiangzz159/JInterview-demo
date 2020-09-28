package com.mythtrad.proj3.pipeReaderWriter;


import java.io.*;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/25 13:41
 * @Desc：
 */
public class Run {
    public static void main(String[] args) {
        try {
            WriteData writeData = new WriteData();
            ReadData readData = new ReadData();
            PipedReader inputStream = new PipedReader();
            PipedWriter outputStream = new PipedWriter();

            outputStream.connect(inputStream);
            ThreadRead threadRead = new ThreadRead(readData, inputStream);
            threadRead.start();
            Thread.sleep(2000);
            ThreadWrite threadWrite = new ThreadWrite(writeData, outputStream);
            threadWrite.start();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
