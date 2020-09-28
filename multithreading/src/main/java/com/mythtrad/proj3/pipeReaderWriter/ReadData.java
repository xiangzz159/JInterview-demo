package com.mythtrad.proj3.pipeReaderWriter;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedReader;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/25 13:35
 * @Desc：
 */
public class ReadData {
    public void readMethod(PipedReader input) {
        try {
            System.out.println("read:");
            char[] byteArray = new char[20];
            int readLength = input.read(byteArray);
            while (readLength != -1) {
                String newData = new String(byteArray, 0, readLength);
                System.out.println(newData);
                readLength = input.read(byteArray);
            }
            System.out.println();
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
