package com.stydy.aop3;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @Author：Yerik Xiang
 * @Date：2021/4/30 17:06
 * @Desc：
 */
@Aspect
public class AnnotaionPointCut {
    @Before("execution(* com.stydy.aop1.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("======方法执行前======");
    }

    @After("execution(* com.stydy.aop1.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("======方法执行后======");
    }



}
