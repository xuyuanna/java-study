package Day1_9;

/*
对象一建立就会调用与之对应的构造函数。
构造函数的作用：可以用于给对象进行初始化。

当一个类中没有定义构造函数时，那系统会默认给该类加入一个空参数的构造函数。
当在类中自定义了构造函数时，默认的构造函数就不存在了。

构造函数是在对象一建立就运行，给对象初始化。
而一般方法是对象调用才执行，给是对象添加对象具备的功能。

一个对象建立，构造函数只运行一次，而一般函数可以被该对象调用多次。

什么时候定义构造函数？
当分析事物时，该事物存在就具备一些特性或者行为，那么将这些内容定义在构造函数中。

 */
class Person1 {
    //Day1_9.Person1(){}      空参数的构造函数

    private String name;
    private int age;

    /*
    构造代码块。
    给对象进行初始化。对象一建立就运行，而且优先于构造函数执行。
    和构造函数的区别：构造代码块是给所有对象进行统一初始化，而构造函数是给对应的对象进行初始化。

    构造代码块 中定义的是不同对象共性的初始化内容.
   */
    {
        born();
    }

    Person1(){
        System.out.println("person1:name="+name+",age="+age);
    }

    Person1(String n){
        name = n;
        System.out.println("person2:name="+name+",age="+age);
    }

    Person1(String n, int a){
        name = n;
        age = a;
        System.out.println("person3:name="+name+",age="+age);
    }

    public void born(){
        System.out.println("born");
    }

    public void setName(String n) {
        name = n;
    }

    public String getName(){
        return name;
    }
}

public class PersonDemo2 {
    public static void main(String[] args) {
        Person1 person1= new Person1();
        //new Day1_9.Person1();
        System.out.println();

        Person1 person2 = new Person1("lisa");

        System.out.println();

        person2.setName("lisa2");
        System.out.println("person2:"+person2.getName());

        person2.setName("lisa33");
        System.out.println("person2:"+person2.getName());

        System.out.println();

        Person1 person3 = new Person1("lisaa",87);

    }
}
