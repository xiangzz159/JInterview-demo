package main.java.com.mydesign.Mediator.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/11 22:23
 * @Desc：
 */
public class ConcreteMediator extends Mediator {
    private List<Colleague> colleagues = new ArrayList<Colleague>();
    public void register(Colleague colleague) {
        if (!colleagues.contains(colleague)) {
            colleagues.add(colleague);
            colleague.setMedium(this);
        }
    }
    public void relay(Colleague cl) {
        for (Colleague ob : colleagues) {
            if (!ob.equals(cl)) {
                ((Colleague) ob).receive();
            }
        }
    }
}
