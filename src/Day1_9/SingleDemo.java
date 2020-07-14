package Day1_9;

/*
设计模式：解决某一类问题最行之有效的方法
java中23种设计模式
单例设计模式：解决一个类在内存中只存在一个对象

 想要保证对象唯一。
 1、为了避免其他程序过多建立该类对象，先禁止其他程序建立该类对象
 2、为了让其他程序可以访问到该类对象，只好在本类种自定义一个对象
 3、为了方便其他程序对自定义对象的访问，可以对外提供一些访问方式

这三部怎么用代码体现？
1、将构造函数私有化
2、在类中创建本类对象
3、提供一个方法可以获取到该对象

当需要将该事物的对象保证在内存中唯一时，就加上以上三步即可。

第一种：饿汉式（建议使用饿汉式）
Single一进内存，就已经创建好了对象。
 */
class Single {
    private int num;

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    private Single() {
    }

    ;

    private static Single s = new Single();

    public static Single getInstance() {
        return s;
    }
}

public class SingleDemo {
    public static void main(String[] args) {

        Single s1 = Single.getInstance();
        Single s2 = Single.getInstance();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);

        s1.setNum(30);

        System.out.println(s2.getNum());  //30

        System.out.println("-----------------");

        Stu stu1 = Stu.getStu();
        Stu stu2 = Stu.getStu();

        stu2.setAge(16);
        System.out.println(stu1.getAge());
    }
}

class Stu {
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    private Stu() {
    }

    ;

    private static Stu stu = new Stu();

    public static Stu getStu() {
        return stu;
    }
}
