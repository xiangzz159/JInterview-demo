package main.java.com.mydesign.Composite.demo3;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/13 17:52
 * @Desc：
 */
public class Goods implements Articles {
    private String name;     //名字
    private int quantity;    //数量
    private float unitPrice; //单价
    public Goods(String name, int quantity, float unitPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }
    public float calculation() {
        return quantity * unitPrice;
    }
    public void show() {
        System.out.println(name + "(数量：" + quantity + "，单价：" + unitPrice + "元)");
    }
}
