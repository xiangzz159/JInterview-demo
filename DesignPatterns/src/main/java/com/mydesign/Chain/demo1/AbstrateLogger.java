package com.mydesign.Chain.demo1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/7 22:18
 * @Desc：
 */
public abstract class AbstrateLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected  int level;

    protected AbstrateLogger nextLogger;

    public void setNextLogger(AbstrateLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }
    abstract protected void write(String message);
}
