/*
TreeSet排序的第二中方式：当元素自身不具备比较性时，或者具备的比较性不是需要的。
就需要让集合自身具备
在集合一初始化时，就有了比较方式

定义比较器，将比较器对象作为参数传递给TreeSet集合的构造杉树

当两种方式都存在时， 以比较器为主
定义一个类，实现 Comparator 接口，覆盖compare方法

Comparable--compareTo
比较器：Comparator---compare--传一个参数
 */
package Day15;

import jdk.nashorn.internal.ir.ReturnNode;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        System.out.println("Comparator---compare--传一个参数");

        TreeSet ts = new TreeSet();

        ts.add(new Person("张三三", 21));
        ts.add(new Person("雷轰宏", 21));
        ts.add(new Person("王五吴", 65));
        ts.add(new Person("王五吴", 65));

        ts.add(new Person("王五无", 65));
        ts.add(new Person("兄弟裟", 47));
        ts.add(new Person("兄弟裟", 49));


        Iterator it = ts.iterator();
        while (it.hasNext()) {
            Person p = (Person) it.next();
            System.out.println(p.getName() + "....." + p.getAge());
        }
    }
}

//该接口强制让学生具备比较性
class Person implements Comparable {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Object obj) {
//        return -1;
//        return -1;
//        return 0;

        if (!(obj instanceof Person)) {
            throw new RuntimeException("错误了，不是学生");
        }

//        obj instanceof Student
        Person p = (Person) obj;
        if (this.age > p.age) {
            return 1;
        }
        if (this.age == p.age) {
            return this.name.compareTo(p.name);
        } else {
            return -1;
        }

    }
}

//比较器：Comparator---compare--传一个参数
class MyCompare implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Person p1 = (Person) o1;
        Person p2 = (Person) o2;

        int num = p1.getName().compareTo(p2.getName());
        if (num == 0) {
//            if (p1.getAge() > p2.getAge()) {
//                return 1;
//            }
//            if (p1.getAge() == p2.getAge()) {
//                return 0;
//            } else {
//                return -1;
//            }
            return new Integer(p1.getAge()).compareTo(new Integer(p2.getAge()));
        }
        return num;
    }
}
