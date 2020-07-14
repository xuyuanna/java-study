package Day1_9;/*
static （静态）关键字。  用于修饰成员（成员变量和成员函数）
当成员被静态修饰后，就多了一种调用方式，除了可以被对象调用外，还可以直接被类名调用，【【类名.静态成员-->Day1_9.Beef.country

1、随着类的加载而加载。静态会随着类的消失而消失，说明它的生命周期最长。
2、优先于对象存在。明确静态是先存在，对象是后存在的。
3、被所有对象所共享。4、可以直接被类名所调用

实例变量和类变量的区别：
1、存放位置。
类变量随着类的加载而存在方法区中。随着类的消失而消失
实例变量随着对象的建立而存在于堆内存中
2、生命周期
类变量生命周期最长，随着类的消失而消失。
实例变量生命周期随着对象的消失而消失。

静态的使用注意事项：
1、静态方法只能访问静态成员（方法和变量）
非静态方法既可以访问静态，也可以访问非静态
2、静态方法中不可以定义this和super关键字。因为静态优先于对象存在。
3、主函数是静态的

优点：对对象的共享数据进行d单独空间的存储，节省空间。没有必要每个对象都储存一份。
可以直接被类名调用
弊端：生命周期太长
访问出现局限性。（只能访问静态，不能访问非静态）
 */

class Beef {
    String name;    //成员变量，实例变量。
    static String country = "CN";   //静态成员变量，类变量。

    public void show() {
        System.out.println(country + ":" + name);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        Beef beef = new Beef();
        beef.name = "good";
        beef.show();

        System.out.println("----------");

        System.out.println(Beef.country);
    }
}
