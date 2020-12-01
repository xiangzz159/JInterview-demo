package com.mydesign.Command.demo1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/1 16:14
 * @Desc：
 */
public class Stock {
    private String name = "ABC";
    private int quantity = 10;

    public void buy(){
        System.out.println("Stock [ Name: "+name+",Quantity: " + quantity +" ] bought");
    }
    public void sell(){
        System.out.println("Stock [ Name: "+name+",Quantity: " + quantity +" ] sold");
    }
}
