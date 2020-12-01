package com.mydesign.Command.demo1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/1 16:16
 * @Desc：
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
