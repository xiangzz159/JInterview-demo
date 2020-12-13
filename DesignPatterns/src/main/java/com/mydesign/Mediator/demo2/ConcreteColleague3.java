package main.java.com.mydesign.Mediator.demo2;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/11 22:22
 * @Desc：
 */
public class ConcreteColleague3 extends Colleague {
    public void receive() {
        System.out.println("具体同事类3收到请求。");
    }
    public void send() {
        System.out.println("具体同事类3发出请求。");
        mediator.relay(this); //请中介者转发
    }
}
