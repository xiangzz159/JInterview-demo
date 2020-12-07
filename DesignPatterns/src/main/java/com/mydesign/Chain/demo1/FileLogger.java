package main.java.com.mydesign.Chain.demo1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/7 22:24
 * @Desc：
 */
public class FileLogger extends AbstrateLogger {
    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger:" + message);
    }
}
