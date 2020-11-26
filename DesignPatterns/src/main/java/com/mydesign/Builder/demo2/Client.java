package com.mydesign.Builder.demo2;

/**
 * @Author：Yerik Xiang
 * @Date：2020/11/25 17:36
 * @Desc：
 */
public class Client {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal order1 = mealBuilder.order1();
        System.out.println("------order1------");
        order1.showItem();
        System.out.println("总额：￥" + order1.getCost());


        Meal order2 = mealBuilder.order2();
        System.out.println("------order2------");
        order2.showItem();
        System.out.println("总额：￥" + order2.getCost());
    }
}
