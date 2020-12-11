package com.mydesign.Chain.demo3;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/7 23:07
 * @Desc：
 */
public abstract class Leader {
    private Leader next;

    public Leader getNext() {
        return next;
    }

    public void setNext(Leader next) {
        this.next = next;
    }

    public abstract void handleRequest(int leaveDays);
}
