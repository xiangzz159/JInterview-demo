package com.stydy.proxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author：Yerik Xiang
 * @Date：2021/4/30 15:30
 * @Desc：动态代理核心类：Proxy InvocationHandler
 * Proxy：生成代理类
 * InvocationHandler：处理代理实例并返回结果
 */
public class ProxyInvocationHandler implements InvocationHandler {
    // 被代理的接口
    private Object target;

    public void setRent(Object target) {
        this.target = target;
    }

    // 生成得到的代理类
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }
    // 处理代理实例，并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 动态代理的本质就是使用反射机制实现
        Object result = method.invoke(target, args);
        return result;
    }


}
