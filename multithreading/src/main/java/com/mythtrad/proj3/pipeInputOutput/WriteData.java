package com.mythtrad.proj3.pipeInputOutput;

import java.io.IOException;
import java.io.PipedOutputStream;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/25 13:34
 * @Desc：
 */
public class WriteData {
    public void writeMethod(PipedOutputStream out) {
        try {
            System.out.println("write:");
            for (int i = 0; i < 300; i++) {
                String outData = "" + (i + 1);
                out.write(outData.getBytes());
                System.out.println(outData);
            }
            System.out.println("Write data end! Close PipedOutputStream.");
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
