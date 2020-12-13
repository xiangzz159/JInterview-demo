package main.java.com.mydesign.Composite.demo2;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/13 17:42
 * @Desc：
 */
public interface Component {
    public void add(Component c);
    public void remove(Component c);
    public Component getChild(int i);
    public void operation();
}
