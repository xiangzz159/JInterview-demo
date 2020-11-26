package com.mydesign.Template.demo1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/11/26 10:42
 * @Desc：
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
