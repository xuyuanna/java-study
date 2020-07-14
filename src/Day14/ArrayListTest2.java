/*
将自定义对象作为元素存储到 ArrayList 集合中，并去除重复元素

1、描述对象，将数据封装到对象
2、定义容器，将对象存入
3、取出

List集合判断元素是否相同，依据的是元素的equals方法
 */

package Day14;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest2 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();


//        al.add(Object obj);
//        Object obj = new Person("张三", 30);
//        提升

        al.add(new Person1("张三", 30));
        al.add(new Person1("李四", 49));
        al.add(new Person1("王五", 64));
        al.add(new Person1("李四", 49));
        al.add(new Person1("张三", 30));
        al.add(new Person1("高六", 88));

        Person1 xcf = new Person1("xcf", 18);
        Person1 xyn = new Person1("xyn", 18);
        System.out.println(xcf.equals(xyn));

        System.out.println("1".equals(1));


        al = singleElement(al);


        for (Iterator it = al.iterator(); it.hasNext(); ) {
//            Object没有getName方法。向下转型
//            Object obj = it.next();
//            Person person = (Person) obj;

            Person1 person1 = (Person1) it.next();
            System.out.println(person1.getName() + "........" + person1.getAge());
        }


    }

    //去除重复
    public static ArrayList singleElement(ArrayList al) {
        //定义一个临时ArrayList容器，存储al的元素
        ArrayList arraylist = new ArrayList();

        //判断，往临时容器里存储al的元素
        for (Iterator it = al.iterator(); it.hasNext(); ) {
            Object object = it.next();
            if (!arraylist.contains(object)) {
                arraylist.add(object);
            }
        }
        return arraylist;
    }
}

class Person1 {
    private String name;
    private int age;

    Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person1)) {
            return false;
        }
        Person1 person = (Person1) obj;
        return this.name.equals(person.name) && this.age == person.age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}