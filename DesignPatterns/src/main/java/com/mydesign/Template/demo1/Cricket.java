package com.mydesign.Template.demo1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/11/26 10:42
 * @Desc：
 */
public class Cricket extends Game {
    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }
}
