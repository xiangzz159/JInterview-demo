package com.mydesign.State.demo3;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/8 17:27
 * @Desc：
 */
public class ScoreStateTest {
    public static void main(String[] args) {
        ScoreContext account = new ScoreContext();
        System.out.println("学生成绩状态测试：");
        account.add(30);
        account.add(40);
        account.add(25);
        account.add(-15);
        account.add(-25);
    }
}
