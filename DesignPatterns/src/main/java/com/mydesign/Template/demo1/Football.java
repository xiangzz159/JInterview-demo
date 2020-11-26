package com.mydesign.Template.demo1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/11/26 10:42
 * @Desc：
 */
public class Football extends Game {
    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }
}
