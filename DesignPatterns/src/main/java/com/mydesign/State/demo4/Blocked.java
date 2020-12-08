package com.mydesign.State.demo4;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/8 17:53
 * @Desc：
 */
public class Blocked extends ThreadState {
    public Blocked() {
        stateName = "阻塞状态";
        System.out.println("当前线程处于：阻塞状态.");
    }
    public void resume(ThreadContext hj) {
        System.out.print("调用resume()方法-->");
        if (stateName.equals("阻塞状态")) {
            hj.setState(new Runnable());
        } else {
            System.out.println("当前线程不是阻塞状态，不能调用resume()方法.");
        }
    }
}
