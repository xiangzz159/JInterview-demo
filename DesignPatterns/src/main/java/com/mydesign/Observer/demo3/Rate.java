package com.mydesign.Observer.demo3;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/9 17:39
 * @Desc：
 */
public abstract class Rate {
    protected List<Company> companys = new ArrayList<Company>();
    //增加观察者方法
    public void add(Company company) {
        companys.add(company);
    }
    //删除观察者方法
    public void remove(Company company) {
        companys.remove(company);
    }
    public abstract void change(int number);
}
