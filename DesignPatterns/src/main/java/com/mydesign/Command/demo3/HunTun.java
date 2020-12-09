package main.java.com.mydesign.Command.demo3;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/9 23:06
 * @Desc：
 */
public class HunTun implements Breakfast {
    private HunTunChef receiver;
    HunTun() {
        receiver = new HunTunChef();
    }
    public void cooking() {
        receiver.cooking();
    }
}
