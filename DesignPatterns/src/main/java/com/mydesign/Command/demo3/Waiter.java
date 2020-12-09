package main.java.com.mydesign.Command.demo3;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/9 23:04
 * @Desc：
 */
public class Waiter {
    private Breakfast changFen, hunTun, heFen;
    public void setChangFen(Breakfast f) {
        changFen = f;
    }
    public void setHunTun(Breakfast f) {
        hunTun = f;
    }
    public void setHeFen(Breakfast f) {
        heFen = f;
    }
    public void chooseChangFen() {
        changFen.cooking();
    }
    public void chooseHunTun() {
        hunTun.cooking();
    }
    public void chooseHeFen() {
        heFen.cooking();
    }
}
