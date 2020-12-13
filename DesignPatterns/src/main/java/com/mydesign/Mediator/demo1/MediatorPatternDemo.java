package main.java.com.mydesign.Mediator.demo1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/11 22:04
 * @Desc：
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
