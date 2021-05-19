package com.stydy.aop2;

import com.stydy.aop1.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author：Yerik Xiang
 * @Date：2021/4/30 16:27
 * @Desc：方法2
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop2.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.add();

    }
}