package com.mydesign.Chain.demo1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/7 22:25
 * @Desc：
 */
public class ChainPatternDemo {
    private static AbstrateLogger getChainOfLoggers() {
        AbstrateLogger errorLogger = new ErrorLogger(AbstrateLogger.ERROR);
        AbstrateLogger fileLogger = new FileLogger(AbstrateLogger.DEBUG);
        AbstrateLogger consoleLogger = new ConsoleLogger(AbstrateLogger.INFO);
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }
    public static void main(String[] args) {
        AbstrateLogger loggerChain = getChainOfLoggers();
        loggerChain.logMessage(AbstrateLogger.INFO, "This is an information.");

        loggerChain.logMessage(AbstrateLogger.DEBUG,"This is a debug level information.");

        loggerChain.logMessage(AbstrateLogger.ERROR,"This is an error information.");
    }
}
