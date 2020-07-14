/*
往 HashSet 存入自定义对象
姓名和年龄相同为重复元素

HashSet如何保证元素的唯一性？：
通过元素的hashCode和equals来完成
如果元素的hashCode值相同，才会判断equals是否为true
如果hashCode值不同，不会调用equals

注意：对于判断元素是否存在以及删除添加等操作，都依赖元素的hashCode（先）和equals（后）方法
*/

package Day14;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo2 {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(new Person2("张三", 25));
        hs.add(new Person2("王五", 78));
        hs.add(new Person2("李四", 54));
        hs.add(new Person2("王五", 78));
        hs.add(new Person2("高其", 82));
        hs.add(new Person2("张三", 25));
        hs.add(new Person2("张三", 999));


        System.out.println(hs.contains(new Person2("张三", 999)));
        hs.remove(new Person2("高其",82));

        Iterator it = hs.iterator();
        while (it.hasNext()) {
            Person2 person = (Person2) it.next();
            System.out.println(person.getName() + "......" + person.getAge());
        }
    }
}

class Person2 {
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private String name;
    private int age;

    Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age * 5;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person2)) {
            return false;
        }

        Person2 person = (Person2) obj;
        return this.name.equals(person.name) && this.age == person.age;
    }
}
