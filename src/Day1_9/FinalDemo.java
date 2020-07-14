package Day1_9;/*
final关键字，作为修饰符
1、可以修饰类，函数，变量。   final 类-->不能被继承，final。  函数-->不能被复写。
2、被final修饰的类不可以被继承。
3、被final修饰的函数方法不可以被复写
4、被final修饰的变量是一个常量，只能赋值一次，既可以修饰成员变量，又可以修饰局部变量
    当在描述事物时，一些数据的出现值是固定不变的，那么这时为了增强阅读性，都给这些值起个名字方便于阅读。
    这个值不需要改变。所以家上final修饰。
    常量的书写规范所有字母都大写，如果有多个单词组成，单词间通过_连接。

内部类定义在类中的局部位置上时，只能访问该局部被final修饰的局部变量
 */

/* final*/class Demo {
    final int x = 3;  //一直是3
    public static final double MY_PI = 3.14;   //Π

    final void show() {
    }

    void show2() {
        final int y = 4;
    }
}

class SubDemo extends Demo {
    //void show(){}   不能被复写

    void show1() {

    }
}


public class FinalDemo {
    public static void main(String[] args) {

    }
}
