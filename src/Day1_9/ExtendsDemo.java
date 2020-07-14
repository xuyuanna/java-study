package Day1_9;/*
继承关系--> 【类名 extends 共性的类名】
将学生和工人的共性描述提取出来，单独进行描述让学生和工人与单独描述的这个类有关系就可以了。
先有父类，才有子类

1、提高代码的复用性
2、继承让类与类之间产生了关系，有了这个关系，才有了多态的特性

注意：千万不要为了获取其他类的功能，简化代码而继承。
必须是类与类之间有所属关系才可以继承，所属关系叫做is a。
 */

/*
在java语言当中，只支持单继承，不支持多继承。一个类只能继承一个类
因为多继承容易带来安全隐患。当多个父类中定义了相同功能，但是功能内容不同时，子类对象不确定要运行哪一个
但是Java保留了这种机制，并用另一种体现形式来完成表示。-->多实现
Java支持多层继承。也就是一个继承体系。a→b，b→a，.....

如何使用一个继承体系中的功能呢？
想要使用体系，先查阅体系父类的描述，因为父类中定义的是该体系中的共性功能，通过了解共性功能就可以知道该体系的基本功能

那么在具体调用时，要创建最子类的对象，为什么？
1、有可能父类不能创建对象 2、创建子类对象可以使用更多的功能，包括基本的也包括特有的

查阅父类功能，创建子类对象 使用功能
 */

//共性类.父类，基类，超类
class Person3 {
    String name;
    int age;
}

//extends Day1_9.Person3 继承Person3，子类
class Teacher extends Person3 {
    //String name;
    //int age;

    void teach() {
        System.out.println(name + " good teach");
    }
}

//extends Day1_9.Person3 继承Person3，子类
class Worker extends Person3 {
    //String name;
    //int age;

    void work() {
        System.out.println("good work");
    }
}

public class ExtendsDemo {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name = "李不四";
        teacher.teach();
    }
}

/*
继承关系：has a
聚合：
组合：
继承关系
 */
