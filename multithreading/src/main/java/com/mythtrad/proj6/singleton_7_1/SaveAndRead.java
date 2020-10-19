package com.mythtrad.proj6.singleton_7_1;

import java.io.*;

/**
 * @Author：Yerik Xiang
 * @Date：2020/10/19 17:07
 * @Desc：
 */
public class SaveAndRead {
    public static void main(String[] args) {
        try {
            MyObject myObject = MyObject.getInstance();
            FileOutputStream sofRed = new FileOutputStream(new File("test.txt"));
            ObjectOutputStream oosRef = new ObjectOutputStream(sofRed);
            oosRef.writeObject(myObject);
            oosRef.close();
            sofRed.close();
            System.out.println(myObject.hashCode());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fisRef = new FileInputStream(new File("test1.txt"));
            ObjectInputStream iosRef = new ObjectInputStream(fisRef);
            MyObject myObject = (MyObject) iosRef.readObject();
            iosRef.close();
            fisRef.close();
            System.out.println(myObject.hashCode());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
