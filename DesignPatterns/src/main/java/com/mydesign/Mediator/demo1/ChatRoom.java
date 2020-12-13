package main.java.com.mydesign.Mediator.demo1;

import java.util.Date;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/11 22:03
 * @Desc：
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}
