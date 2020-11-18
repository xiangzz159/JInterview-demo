package dispatch;

/**
 * @Author：Yerik Xiang
 * @Date：2020/11/18 15:09
 * @Desc：方法动态分派演示
 */
public class DynamicDispatch {
    static abstract class Human {
        abstract void sayHello();
    }
    static class Man extends Human {
        @Override
        void sayHello() {
            System.out.println("Man say hello!");
        }
    }
    static class Woman extends Human {
        @Override
        void sayHello() {
            System.out.println("Woman say hello!");
        }
    }
    public static void main(String[] args){
        Human man = new Man();
        Human woman = new Woman();
        man.sayHello();
        woman.sayHello();

        man = new Woman();
        man.sayHello();
    }
}
