package main.java.com.mydesign.Chain.demo2;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/7 23:02
 * @Desc：
 */
public class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("two")) {
            System.out.println("处理者2负责处理该请求！");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(request);
            } else {
                System.out.println("没有人处理该亲求！");
            }
        }
    }
}
