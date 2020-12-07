package main.java.com.mydesign.Chain.demo1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/7 22:22
 * @Desc：
 */
public class ConsoleLogger extends AbstrateLogger {
    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger:" + message);
    }
}
