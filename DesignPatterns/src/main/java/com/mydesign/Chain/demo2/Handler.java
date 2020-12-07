package main.java.com.mydesign.Chain.demo2;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/7 22:52
 * @Desc：
 */
public abstract class Handler {
    private Handler next;

    public void setNext(Handler handler) {
        this.next = handler;
    }

    public Handler getNext() {
        return next;
    }

    public abstract void handleRequest(String request);
}
