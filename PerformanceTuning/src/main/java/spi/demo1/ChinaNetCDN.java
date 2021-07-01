package spi.demo1;

/**
 * @Author：Yerik Xiang
 * @Date：2021/6/30 10:08
 * @Desc：
 */
public class ChinaNetCDN implements UploadCDN {
    public void upload(String url) {
        System.out.println("upload to chinaNet cdn");
    }
}
