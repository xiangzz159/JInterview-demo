package com.mydesign.Decorator.demo2;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/13 18:58
 * @Desc：
 */
public class Decorator implements Component {
    private Component component;
    public Decorator(Component component) {
        this.component = component;
    }
    public void operation() {
        component.operation();
    }
}
