package com.mythtrad.proj3.pipeReaderWriter;

import java.io.IOException;
import java.io.PipedWriter;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/25 13:58
 * @Desc：
 */
public class WriteData {
    public void writeMethod(PipedWriter out) {
        try {
            System.out.println("write:");
            for (int i = 0; i < 300; i++) {
                String outData = "" + (i + 1);
                out.write(outData);
                System.out.println(outData);
            }
            System.out.println();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
