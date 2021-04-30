package com.mydesign.Proxy.demo1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/12 0:40
 * @Desc：
 */
public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
