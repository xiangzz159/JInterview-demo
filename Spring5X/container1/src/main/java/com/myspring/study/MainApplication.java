package com.myspring.study;

import com.myspring.study.config.AppConfig;
import com.myspring.study.dao.OrderDao;
import com.myspring.study.dao.UserDao;
import com.myspring.study.service.OrderService;
import com.myspring.study.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author：Yerik Xiang
 * @Date：2021/3/30 10:21
 * @Desc：
 */
public class MainApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = applicationContext.getBean(UserService.class);
        System.out.println(userService);

        OrderService orderService = applicationContext.getBean(OrderService.class);
        System.out.println(orderService);

        UserDao userDao = applicationContext.getBean(UserDao.class);
        System.out.println(userDao);

        OrderDao orderDao = applicationContext.getBean(OrderDao.class);
        System.out.println(orderDao);

        applicationContext.close();

    }

}
