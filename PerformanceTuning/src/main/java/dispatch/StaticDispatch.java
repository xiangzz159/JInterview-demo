package dispatch;

/**
 * @Author：Yerik Xiang
 * @Date：2020/11/18 14:44
 * @Desc：方法静态分派演示
 * 这段代码中的「Human」称为变量的静态类型（Static Type），或者叫做外观类型（Apparent Type），后面的「Man」称为变量为实际类型（Actual Type），
 * 静态类型和实际类型在程序中都可以发生一些变化，区别是静态类型的变化仅发生在使用时，变量本身的静态类型不会被改变，并且最终的静态类型是在编译期可知的；
 * 而实际类型变化的结果在运行期才可确定，编译器在编译程序的时候并不知道一个对象的实际类型是什么。
 *
 * 弄清了这两个概念，再来看 StaticDispatch 类中 main() 方法里的两次 sayHello() 调用，在方法接受者已经确定是对象「dispatch」的前提下，使用哪个重载版本，就完全取决于传入参数的数量和数据类型。
 * 代码中定义了两个静态类型相同但是实际类型不同的变量，但是虚拟机（准确的说是编译器）在重载时是通过参数的静态类型而不是实际类型作为判定依据的。
 * 并且静态类型是编译期可知的，因此在编译阶段， Javac 编译器会根据参数的静态类型决定使用哪个重载版本，所以选择了 sayHello(Human) 作为调用目标，并把这个方法的符号引用写到 man() 方法里的两条 invokevirtual 指令的参数中。
 *
 * 所有依赖静态类型来定位方法执行版本的分派动作称为静态分派。静态分派的典型应用是方法重载。静态分派发生在编译阶段，因此确定静态分派的动作实际上不是由虚拟机来执行的。
 */
public class StaticDispatch {
    private static abstract class Human { }
    private static class Man extends Human { }
    private static class Woman extends Human { }
    private void sayHello(Human guy) {
        System.out.println("Hello, guy!");
    }
    private void sayHello(Man man) {
        System.out.println("Hello, man!");
    }
    private void sayHello(Woman woman) {
        System.out.println("Hello, woman!");
    }
    public static void main(String[] args) {
        Human man = new Man();
        Human woman = new Woman();
        StaticDispatch dispatch = new StaticDispatch();
        dispatch.sayHello(man);
        dispatch.sayHello(woman);
    }
}
