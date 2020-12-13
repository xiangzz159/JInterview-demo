package main.java.com.mydesign.Visitor.demo2;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/11 23:50
 * @Desc：
 */
public interface Element {
    void accept(Visitor visitor);

}
