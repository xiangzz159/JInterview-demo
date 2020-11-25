package com.mydesign.builder.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author：Yerik Xiang
 * @Date：2020/11/25 17:22
 * @Desc：
 */
public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;

        for (Item item : items) {
            cost += item.getPrice();
        }
        return cost;
    }

    public void showItem() {
        for (Item item : items) {
            System.out.print("餐品：" + item.getName());
            System.out.print("，价格：" + item.getPrice());
            System.out.println("，包装" + item.packing().getPack());
        }
    }
}
