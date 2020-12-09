package main.java.com.mydesign.Command.demo4;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/9 23:12
 * @Desc：
 */
public class ConcreteCommand1 implements AbstractCommand {
    private CompositeReceiver receiver;
    ConcreteCommand1() {
        receiver = new CompositeReceiver();
    }
    public void execute() {
        receiver.action1();
    }
}
