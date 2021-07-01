package spi.demo1;

import java.util.ServiceLoader;

/**
 * @Author：Yerik Xiang
 * @Date：2021/6/30 10:11
 * @Desc：
 */
public class Demo1Run {
    public static void main(String[] args) {
        ServiceLoader<UploadCDN> uploadCDN = ServiceLoader.load(UploadCDN.class);
        for (UploadCDN u : uploadCDN) {
            u.upload("filePath");
        }
        System.out.println("------------------------");
        for (UploadCDN u : uploadCDN) {
            u.upload("filePath");
        }
    }
}
