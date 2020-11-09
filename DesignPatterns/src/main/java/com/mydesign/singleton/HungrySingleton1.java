package com.mydesign.singleton;

import java.io.*;

/**
 * @Author：Yerik Xiang
 * @Date：2020/11/8 14:41
 * @Desc：序列化破坏单例
 * 结果发现，经过序列化和反序列化之后拿到的对象是两个，这违背了单例模式的初衷。
 */
public class HungrySingleton1 implements Serializable {
    private final static HungrySingleton1 hungrySingleton = new HungrySingleton1();

    public HungrySingleton1() {
    }

    public static HungrySingleton1 getInstance() {
        return hungrySingleton;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        HungrySingleton1 instance = HungrySingleton1.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(instance);

        File file = new File("singleton_file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        HungrySingleton1 newInstance = (HungrySingleton1) ois.readObject();
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);

    }
}

