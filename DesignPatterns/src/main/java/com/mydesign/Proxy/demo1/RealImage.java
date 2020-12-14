package com.mydesign.Proxy.demo1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/12 0:38
 * @Desc：
 */
public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}
