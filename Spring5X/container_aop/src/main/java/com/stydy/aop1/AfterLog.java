package com.stydy.aop1;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @Author：Yerik Xiang
 * @Date：2021/4/30 16:09
 * @Desc：
 */
public class AfterLog implements AfterReturningAdvice {
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("执行了" + method.getName() + "的方法，返回结果为：" + o);

    }
}
