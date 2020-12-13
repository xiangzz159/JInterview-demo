package main.java.com.mydesign.Proxy.demo1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/12 0:44
 * @Desc：
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        // 图像将从磁盘加载
        image.display();
        System.out.println("");
        // 图像不需要从磁盘加载
        image.display();
    }
}
