package Day1_9;/*
多态中成员函数的特点
在编译时期：参阅引用型变量所属的类中是否有调用了方法。 如果有，编译通过。如果没有，编译失败
在运行时期：参阅对象所属的类中是否有调用的方法。

总结就是：成员函数在多态调用时，编译看左边，运行看右边

多态中，成员变量的特点：
无论编译和运行都参考左边（引用型变量所属的类）

多态中，静态成员函数的特点
无论编译和运行，都参考左边
 */

class Father {
    int num = 5;

    void method1() {
        System.out.println("Day1_9.Father, method, 1");
    }

    void method2() {
        System.out.println("Day1_9.Father, method, 2");
    }

    static void method4() {
        System.out.println("Fathe, method, 4");
    }
}

class Son extends Father {
    int num = 8;

    @Override
    void method1() {
        System.out.println("Day1_9.Son, method,1");
    }

    void method3() {
        System.out.println("Day1_9.Son, method, 3");
    }

    static void method4() {
        System.out.println("Day1_9.Son, method, 4");
    }
}

public class DuotaiDemo3 {
    public static void main(String[] args) {

//        Day1_9.Son son = new Day1_9.Son();
//        son.method1();
//        son.method2();
//        son.method3();

//        Day1_9.Father f = new Day1_9.Son();
//        System.out.println(f.num);   //5
//
//        Day1_9.Son s = new Day1_9.Son();
//        System.out.println(s.num);   //8

        Father f2 = new Son();
        f2.method4();   //static类相关，不能继承
        //f.method1();
        //f.method2();

        //f.method3();  //父类没有method3
    }
}
