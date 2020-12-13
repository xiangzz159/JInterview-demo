package main.java.com.mydesign.Mediator.demo2;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/11 22:22
 * @Desc：
 */
public abstract class Mediator {
    public abstract void register(Colleague colleague);
    public abstract void relay(Colleague cl); //转发
}
