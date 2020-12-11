package com.mydesign.Observer.demo1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/9 16:19
 * @Desc：
 */
public class OctalObserver extends Observer {
    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: "
                + Integer.toOctalString( subject.getState() ) );
    }
}
