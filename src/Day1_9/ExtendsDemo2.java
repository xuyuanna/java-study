package Day1_9;/*
子父类出现后，类中成员的特点：

类中成员包含三个部分：变量，函数（Day1_9.ExtendsDemo3），构造函数(Day1_9.ExtendsDemo4)
1、变量：如果子父类中出现了非私有的同名成员变量时，
子类要访问本类中的变量，用this.
子类要访问父类中的同名变量，用super.
this代表的是本类对象的引用，super代表的是父类对象的引用
 */

class Fu{
    int num = 4;
}

class Zi extends Fu{
    //int num = 5;
    void show(){

        //super关键字 父类对象的引用
        System.out.println("2:"+super.num);

        //本类的num
        System.out.println("3:"+this.num);
    }
}

public class ExtendsDemo2 {
    public static void main(String[] args) {
        Zi z = new Zi();
        //z.num = 2;
        System.out.println("1:"+z.num);  //5  打印的是子类中的num
        z.show();
    }
}
