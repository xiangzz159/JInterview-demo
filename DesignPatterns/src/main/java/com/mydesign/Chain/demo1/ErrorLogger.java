package main.java.com.mydesign.Chain.demo1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/7 22:23
 * @Desc：
 */
public class ErrorLogger extends AbstrateLogger {
    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger:" + message);
    }
}

