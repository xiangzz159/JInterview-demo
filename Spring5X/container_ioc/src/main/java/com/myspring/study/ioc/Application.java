package com.myspring.study.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author：Yerik Xiang
 * @Date：2021/4/30 11:58
 * @Desc：
 */
public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        User user = (User) context.getBean("user");
        System.out.println(user.toString());
    }
}
