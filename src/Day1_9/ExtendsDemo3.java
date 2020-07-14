package Day1_9;/*
权限1、public 2、privat 3、不写

2、子父类中的函数

当子类出现和父类一模一样的函数时，
当子类对象调用该函数，会运行子类函数的内容，如同父类的函数比覆盖一样
这种情况是函数的另一个特性：重写（覆盖）

当子类继承了父类，沿袭了父类的功能到子类中
但是子类虽然具备该功能，但是功能的内容却和父类不一致
这时没有必要定义新功能，而是使用（覆盖）特性，保留父类的功能定义，并重写功能的内容

覆盖：1、子类覆盖父类，必须保证子类权限大于等于父类权限，才可以覆盖，否则编译失败
2、静态只能覆盖静态。权限要一样。1、public 2、privat 3、不写

记住：
重载：只看同名函数的参数列表
重写：子父类方法要一模一样
*/

//父类
class Fu1 {
    void show() {
        System.out.println("Day1_9.Fu show");
    }

    void speak() {
        System.out.println("Day1_9.Fu speak");
    }
}

//子类
class Zi1 extends Fu1 {
    void show() {
        System.out.println("Day1_9.Zi show");
    }

     void speak() {
        System.out.println("Day1_9.Zi speak");
    }
}

public class ExtendsDemo3 {
    public static void main(String[] args) {
        Zi1 zi = new Zi1();
        zi.show();  //Day1_9.Zi show
        zi.speak();

        NewTel tel = new NewTel();
        tel.show();
        tel.voice();
    }
}

//父类
class Tel {
    void show() {
        System.out.println("Day1_9.Tel:number");
    }

    void voice() {
        System.out.println("Day1_9.Tel:voice");
    }
}

//子类
class NewTel extends Tel {
    void show() {
        //System.out.println("number");
        super.show();
        System.out.println("Day1_9.NewTel name");
    }
}