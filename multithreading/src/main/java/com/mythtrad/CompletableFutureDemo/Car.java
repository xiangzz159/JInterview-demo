package com.mythtrad.CompletableFutureDemo;

/**
 * @Author：Yerik Xiang
 * @Date：2021/5/19 11:51
 * @Desc：
 */
public class Car {
    int id;
    int manufacturerId;
    String model;
    int year;
    float rating;

    public Car(int id, int manufacturerId, String model, int year) {
        this.id = id;
        this.manufacturerId = manufacturerId;
        this.model = model;
        this.year = year;
    }

    void setRating(float rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Car (id=" + id + ", manufacturerId=" + manufacturerId + ", model=" + model + ", year=" + year
                + ", rating=" + rating;
    }
}
