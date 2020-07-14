package Day1_9;

/*
3、子父类中的构造函数

在对子类对象进行初始化时，父类的构造函数也会运行
是因为子类的构造函数默认第一行有一条隐式的语句：  super();
super():会访问父类中空参数的构造函数，而且子类中所有的构造函数默认第一行都是super()

为什么子子类一定要访问父类中的构造函数？
因为父类中的数据子类可以直接获取，所以子类对象在建立时，需要先查看父类是如何对这些数据进行初始化的
所以子类在对象初始化时，要先访问一下父类中的构造函数
如果要访问父类中指定的构造函数，可以通过手动定义super(参数)的语句来指定

注意：super语句一定定义在子类构造函数的第一行。用super的就是子类

子类的实例化过程
结论：子类的所有构造函数，默认都会访问父类中空参数的构造函数，因为每一个子类的构造函数内的第一行都有一句隐式的super()
当父类中没有空参数的构造函数时，子类必须手动通过super()语句来指定要访问的父类中构造函数
当然，子类的构造函数第一行也可以手动指定this()来访问本类中的构造函数。
子类中至少有一个构造函数会访问父类中的构造函数

 */
class Fu2 { //extends Object
    int num;

    Fu2() {
        //super();
        num = 88;
        System.out.println("fu run");
    }

    Fu2(int x) {
        System.out.println("fu" + x);
    }

    void show() {
        System.out.println("fu show");
    }
}

class Zi2 extends Fu2 {
    Zi2() {
        super();   //没有就是省略了
        //super(5);
        System.out.println("zi run");
    }

    Zi2(int x) {
        this();  //写了这个就没有super()了,都只能放在第一行
        //super();
        //super(5);
        System.out.println("zi" + x);
    }

    void show() {
        System.out.println("zi show");
    }

    void ziShow() {
        System.out.println("ziShow show");
    }

}

public class ExtendsDemo4 {
    public static void main(String[] args) {
        Zi2 zi = new Zi2();
        zi.show();
        System.out.println("---------");

        Zi2 zi2 = new Zi2(8);
        System.out.println(zi.num);
    }
}

/*
class Person4 {
    private String name;

    Person4(String name) {
        this.name = name;
    }

    void show() {
        System.out.println("Person4 show");
    }
}

class Person4Student extends Person4 {
    Person4Student(String name) {
        super(name);
    }

    void method() {
        super.show();
    }
}
*/
