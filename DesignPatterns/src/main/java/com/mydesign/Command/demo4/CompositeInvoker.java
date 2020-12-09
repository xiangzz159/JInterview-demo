package main.java.com.mydesign.Command.demo4;

import java.util.ArrayList;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/9 23:12
 * @Desc：
 */
public class CompositeInvoker implements AbstractCommand {
    private ArrayList<AbstractCommand> children = new ArrayList<AbstractCommand>();
    public void add(AbstractCommand c) {
        children.add(c);
    }
    public void remove(AbstractCommand c) {
        children.remove(c);
    }
    public AbstractCommand getChild(int i) {
        return children.get(i);
    }
    public void execute() {
        for (Object obj : children) {
            ((AbstractCommand) obj).execute();
        }
    }
}
