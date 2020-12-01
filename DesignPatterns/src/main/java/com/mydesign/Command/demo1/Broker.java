package com.mydesign.Command.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/1 16:20
 * @Desc：
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
