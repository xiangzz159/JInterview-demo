package main.java.com.mydesign.Builder.demo3;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/9 22:43
 * @Desc：
 */
public class ProjectManager {
    private Decorator builder;
    public ProjectManager(Decorator builder) {
        this.builder = builder;
    }
    //产品构建与组装方法
    public Parlour decorate() {
        builder.buildWall();
        builder.buildTV();
        builder.buildSofa();
        return builder.getResult();
    }
}
