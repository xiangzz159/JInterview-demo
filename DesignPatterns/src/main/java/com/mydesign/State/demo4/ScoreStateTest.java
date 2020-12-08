package com.mydesign.State.demo4;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/8 17:49
 * @Desc：
 */
public class ScoreStateTest {
    public static void main(String[] args) {
        ThreadContext context = new ThreadContext();
        context.start();
        context.getCPU();
        context.suspend();
        context.resume();
        context.getCPU();
        context.stop();
    }
}
