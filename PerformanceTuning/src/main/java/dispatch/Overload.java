package dispatch;

import java.io.Serializable;

/**
 * @Author：Yerik Xiang
 * @Date：2020/11/18 15:06
 * @Desc：Hello, char!
 * 这很好理解，‘a’ 是一个 char 类型的数据，自然会寻找参数类型为 char 的重载方法，如果注释掉 sayHello(chat arg) 方法，那么输出结果将会变为：
 *
 * Hello, int!
 * 这时发生了一次类型转换， ‘a’ 除了可以代表一个字符，还可以代表数字 97，因为字符 ‘a’ 的 Unicode 数值为十进制数字 97，因此参数类型为 int 的重载方法也是合适的。我们继续注释掉 sayHello(int arg) 方法，输出变为：
 *
 * Hello, long!
 * 这时发生了两次类型转换，‘a’ 转型为整数 97 之后，进一步转型为长整型 97L，匹配了参数类型为 long 的重载方法。我们继续注释掉 sayHello(long arg) 方法，输出变为：
 *
 * Hello, Character!
 * 这时发生了一次自动装箱， ‘a’ 被包装为它的封装类型 java.lang.Character，所以匹配到了类型为 Character 的重载方法，继续注释掉 sayHello(Character arg) 方法，输出变为：
 *
 * Hello, Serializable!
 * 这里输出之所以为「Hello, Serializable!」，是因为 java.lang.Serializable 是 java.lang.Character 类实现的一个接口，当自动装箱后发现还是找不到装箱类，但是找到了装箱类实现了的接口类型，所以紧接着又发生了一次自动转换。char 可以转型为 int，但是 Character 是绝对不会转型为 Integer 的，他只能安全的转型为它实现的接口或父类。Character 还实现了另外一个接口 java.lang.Comparable，如果同时出现两个参数分别为 Serializable 和 Comparable 的重载方法，那它们在此时的优先级是一样的。编译器无法确定要自动转型为哪种类型，会提示类型模糊，拒绝编译。程序必须在调用时显示的指定字面量的静态类型，如：sayHello((Comparable) 'a')，才能编译通过。继续注释掉 sayHello(Serializable arg) 方法，输出变为：
 *
 * Hello, Object!
 * 这时是 char 装箱后转型为父类了，如果有多个父类，那将在继承关系中从下往上开始搜索，越接近上层的优先级越低。即使方法调用的入参值为 null，这个规则依然适用。继续注释掉 sayHello(Serializable arg) 方法，输出变为：
 *
 * Hello, char...!
 * 7 个重载方法以及被注释得只剩一个了，可见变长参数的重载优先级是最低的，这时字符 ‘a’ 被当成了一个数组元素。
 *
 * 前面介绍的这一系列过程演示了编译期间选择静态分派目标的过程，这个过程也是 Java 语言实现方法重载的本质。
 */
public class Overload {
    static void sayHello(Object arg) {
        System.out.println("Hello, Object!");
    }

    static void sayHello(int arg) {
        System.out.println("Hello, int!");
    }

    static void sayHello(long arg) {
        System.out.println("Hello, long!");
    }

    static void sayHello(Character arg) {
        System.out.println("Hello, Character!");
    }

    static void sayHello(char arg) {
        System.out.println("Hello, char!");
    }

    static void sayHello(char... arg) {
        System.out.println("Hello, char...!");
    }

    static void sayHello(Serializable arg) {
        System.out.println("Hello, Serializable!");
    }

    public static void main(String[] args) {
        sayHello('a');
    }
}
