package main.java.com.mydesign.Composite.demo2;

import java.util.ArrayList;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/13 17:43
 * @Desc：
 */
public class Composite implements Component {
    private ArrayList<Component> children = new ArrayList<Component>();
    public void add(Component c) {
        children.add(c);
    }
    public void remove(Component c) {
        children.remove(c);
    }
    public Component getChild(int i) {
        return children.get(i);
    }
    public void operation() {
        for (Object obj : children) {
            ((Component) obj).operation();
        }
    }
}
