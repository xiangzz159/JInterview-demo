package com.mydesign.builder.demo2;

/**
 * @Author：Yerik Xiang
 * @Date：2020/11/25 17:34
 * @Desc：
 */
public class MealBuilder {
    public Meal order1() {
        Meal meal = new Meal();
        meal.addItem(new Burger1());
        meal.addItem(new Drink1());
        return meal;
    }

    public Meal order2() {
        Meal meal = new Meal();
        meal.addItem(new Burger2());
        meal.addItem(new Drink2());
        return meal;
    }


}
