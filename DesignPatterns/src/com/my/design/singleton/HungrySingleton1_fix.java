package com.my.design.singleton;

import java.io.*;

/**
 * @Author：Yerik Xiang
 * @Date：2020/11/8 14:41
 * @Desc：Object.readObject()方法会通过反射调用readResolve方法，如果这个类没有这个方法会执行desc.newInstance()，通过反射创建新的单例类，
 */
public class HungrySingleton1_fix implements Serializable {
    private final static HungrySingleton1_fix hungrySingleton = new HungrySingleton1_fix();

    public HungrySingleton1_fix() {
    }

    public static HungrySingleton1_fix getInstance() {
        return hungrySingleton;
    }

    // 该方法并非被重写的方法
    private Object readResolve() {
        return hungrySingleton;
    }


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        HungrySingleton1_fix instance = HungrySingleton1_fix.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(instance);

        File file = new File("singleton_file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        HungrySingleton1_fix newInstance = (HungrySingleton1_fix) ois.readObject();
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);

    }
}

