package Day1_9;/* abstract 抽象的
当多个类中出现相同功能，但是功能主体不同，那么这时也可以进行向上抽取。
这时只抽取功能定义，不抽取功能主体

//父类中的抽象方法子类不复写，就要加上抽象abstract

抽象类的特点：
1、抽象方法一定定义在抽象类中
2、抽象方法和抽象类都必须被abstract关键字修饰
3、抽象类不可以用new创建对象，因为调用抽象没意义
4、抽象类中的抽象方法要被使用，必须由子类复写其抽象方法后，建立子类对象调用
    如果子类只覆盖了部分抽象方法，那么该子类还是一个抽象类

抽象类和一般类没有太大的不同，该如何描述事物就如何描述
只不过该事物中出现了一些看不懂的东西，这些不确定的部分也是该事物的功能，需要明确出来，但是无法定义主体。
通过抽象方法来表示：
抽象类比一般类多了抽象函数，就是在抽象类中可以定义抽象方法。
抽象类不可以实例化，不可以new   ()

特殊：抽象类中可以不定义抽象方法，作用是不让该类建立对象
 */

abstract class StudyStudent {
    abstract void study();
    //abstract void study2();

    void sleep(){
        System.out.println("休息睡觉");
    }
}

class BaseStu extends StudyStudent {
    //复写
    void study() {
        System.out.println("base study");
    }
}


class AdvStu extends StudyStudent {

    //复写
    void study() {
        System.out.println("adv study");
    }
}

class sprintStu extends StudyStudent {
    void study(){
        System.out.println("sprint study");
    }

}

public class AbstractDemo extends Day10_Exception.FushuException01{
    public static void main(String[] args) {
        BaseStu base = new BaseStu();
        base.study();

        new AdvStu().study();  //adv study

    }
}
