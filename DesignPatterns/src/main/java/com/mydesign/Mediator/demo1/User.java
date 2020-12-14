package com.mydesign.Mediator.demo1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/11 22:04
 * @Desc：
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name){
        this.name  = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}
