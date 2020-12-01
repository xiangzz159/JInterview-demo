package com.mydesign.Command.demo1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/1 16:15
 * @Desc：
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}
