package main.java.com.mydesign.Composite.demo3;

import java.util.ArrayList;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/13 17:53
 * @Desc：
 */
public class Bags implements Articles {
    private String name;     //名字
    private ArrayList<Articles> bags = new ArrayList<Articles>();
    public Bags(String name) {
        this.name = name;
    }
    public void add(Articles c) {
        bags.add(c);
    }
    public void remove(Articles c) {
        bags.remove(c);
    }
    public Articles getChild(int i) {
        return bags.get(i);
    }
    public float calculation() {
        float s = 0;
        for (Object obj : bags) {
            s += ((Articles) obj).calculation();
        }
        return s;
    }
    public void show() {
        for (Object obj : bags) {
            ((Articles) obj).show();
        }
    }
}
