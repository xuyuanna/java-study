package Day1_9;

/*
什么时候使用静态？
静态修饰的内容有成员变量和成员函数，就从这两个方面下手。

什么时候定义静态变量（类变量）？
当对象中出现共享数据（值，不是属性）时，该数据被静态所修饰。
对象中的特有数据要定义成非静态存在于堆内存中

什么时候定义静态函数？
当功能内部没有访问到非静态数据（对象的特有数据），那么该功能可以定义成静态的。
 */
class Comp {
    String name;

    public static void show() {
        System.out.println("good!");
    }
}


public class StaticDemo2 {
    public static void main(String[] args) {
        Comp.show();
    }
}
