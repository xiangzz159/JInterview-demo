package com.mydesign.Chain.demo3;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/7 23:18
 * @Desc：
 */
class DeanOfStudies extends Leader {
    @Override
    public void handleRequest(int LeaveDays) {
        if (LeaveDays <= 20) {
            System.out.println("教务处长批准您请假" + LeaveDays + "天。");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(LeaveDays);
            } else {
                System.out.println("请假天数太多，没有人批准该假条！");
            }
        }
    }
}
