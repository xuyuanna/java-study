package Day1_9;

class Person2 {
    private String name;
    private int age;

    Person2() {
    }


    Person2(String name) {
        this.name = name;
    }

    Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void speak() {
        System.out.println("name=" + name + ",age=" + age);
        show();
    }

    /*public static void speak1(){
        System.out.println("name=123 ,age=321");
    }*/

    public void show() {
        System.out.println(this.name);
    }
}

public class PersonDemo3 {

    /*public static void speak1(){
        System.out.println("name=123 ,age=321");
    }*/

    public static void main(String[] args) {

        // 第一种方式,直接通过构造函数初始化
        Person2 p = new Person2("lidasa", 11);
        p.speak();

        /*speak1();*/

        // 第二种方式,先创建对象,再通过setter方法初始化
        Person2 person2 = new Person2();
        person2.setName("123");
        person2.setAge(222);
        person2.speak();

    }
}
