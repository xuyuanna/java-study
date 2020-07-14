package Day1_9;/*接口
初期理解可以认为是一个特殊的抽象类
当抽象类中的方法都是抽象的，那么该类可以通过接口的形式来表示
class用于定义类，interface用于定义接口

接口定义时，格式特点：
1、接口中常见定义：常量。抽象方法。
2、接口中的成员都有固定修饰符
    常量：public static final 可以省略
    方法：public abstract 可以省略
记住：接口中的成员都是public

接口是不可以创建对象的，因为有抽象方法，需要被子类实现，
子类对接口中的抽象方法全都覆盖后，子类才可以实例化。否侧子类是一个抽象化类。

多实现：：接口可以被类多实现，一个类可以同时实现多个接口。是对java多继承不支持的转换形式
接口可以继承接口      interface Day1_9.A extends Day1_9.B
接口可以继承多个接口      interface Day1_9.A extends Day1_9.B,Day1_9.A,....

接口的特点：
1、是对外暴露的规则
2、是程序的功能扩展
3、可以用来多实现
4、类与接口之间是实现关系，而且类可以继承一个类的同时，实现多个接口
5、接口与接口之间可以有继承关系。接口与接口之间不能实现【implements】
基本功能定在类中，扩展功能定在接口中
 */

interface Inter{

    //--->全局静态常量
    public static final int NUM = 3;
    public abstract void show();

}

interface InterA{

    //--->全局静态常量
    public static final int NUM_A = 5;
    public abstract void method();

}

class InterB{
    public void function(){

    }
}


//两个方法名一样的话，只需要重写一次
class InterDemo extends InterB implements Inter, InterA{
    @Override
    public void show(){
        System.out.println("Day1_9.Inter implements");
    }

    @Override
    public  void method(){
        System.out.println("Day1_9.InterA implements");
    }
}

//接口继承接口
interface A{
    void methodA();
}
interface B extends A{
    void methodB();

}
interface C extends B{
    void methodC();

}

class D implements C{
    @Override
    public void methodA(){};
    @Override
    public void methodB(){};
    @Override
    public void methodC(){};

}



public class InterfaceDemo {
    public static void main(String[] args) {

        InterDemo interdemo = new InterDemo();


        interdemo.show();
        interdemo.method();
        System.out.println("---------");

        //static--->类名.   （）
        System.out.println("接口Inter："+Inter.NUM);
        System.out.println("接口InterA："+InterA.NUM_A);
        System.out.println("---------");


        System.out.println("Day1_9.Inter:"+InterDemo.NUM);
        System.out.println("Day1_9.InterA:"+ InterA.NUM_A);
        System.out.println("-----------");

    }
}


