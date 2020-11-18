package dispatch;

/**
 * @Author：Yerik Xiang
 * @Date：2020/11/18 15:22
 * @Desc：这个时候选择目标方法的依据有两点：一是静态类型是 Father 还是 Son；二是方法入参是 QQ 还是 QiHu360。因为是根据两个宗量进行选择的，所以 Java 语言的静态分派属于多分派。
 *
 * 再看看运行阶段虚拟机的选择过程，也就是动态分派的过程。在执行 son.hardChoice(new QiHu360()) 时，由于编译期已经确定目标方法的签名必须为 hardChoice(QiHu360)，
 * 这时参数的静态类型、实际类型都不会对方法的选择造成任何影响，唯一可以影响虚拟机选择的因数只有此方法的接收者的实际类型是 Father 还是 Son。因为只有一个宗量作为选择依据，
 * 所以 Java 语言的动态分派属于单分派。
 */
public class Dispatch {
    static class QQ { }
    static class QiHu360 { }
    static class Father {
        public void hardChoice(QQ qq) {
            System.out.println("Father choice QQ!");
        }
        public void hardChoice(QiHu360 qiHu360) {
            System.out.println("Father choice 360!");
        }
    }
    static class Son extends Father {
        @Override
        public void hardChoice(QQ qq) {
            System.out.println("Son choice QQ!");
        }
        @Override
        public void hardChoice(QiHu360 qiHu360) {
            System.out.println("Son choice 360!");
        }
    }

    public static void main(String[] args) {
        Father father = new Father();
        Father son = new Son();

        father.hardChoice(new QQ());
        son.hardChoice(new QiHu360());
    }
}
