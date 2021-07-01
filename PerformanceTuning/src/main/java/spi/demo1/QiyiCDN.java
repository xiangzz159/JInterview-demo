package spi.demo1;

/**
 * @Author：Yerik Xiang
 * @Date：2021/6/30 10:07
 * @Desc：
 */
public class QiyiCDN implements UploadCDN {
    public void upload(String url) {
        System.out.println("upload to qiyi cdn");
    }
}
