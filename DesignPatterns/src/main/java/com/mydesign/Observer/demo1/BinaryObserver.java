package com.mydesign.Observer.demo1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/9 16:18
 * @Desc：
 */
public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: "
                + Integer.toBinaryString( subject.getState() ) );
    }
}
