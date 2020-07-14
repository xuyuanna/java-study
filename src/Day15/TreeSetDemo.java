/*
Set: 无序，不可以重复元素
    |--HashSet：数据结构是哈希表，线程是非同步的。
        保证元素唯一性的原理是判断元素的HashCode值是否相同。
        如果相同，还会继续判断元素的equals方法是否为true
    |--TreeSet：可以对Set集合中的元素进行排序
        底层数据结构是二叉树。保证元素唯一性的依据是：compareTo方法return0，只保存一个

TreeSet排序的第一种方式：（元素的自然顺序或者默认顺序）
让元素自身具备比较性，元素需要实现Comparable接口，覆盖compareTo方法

TreeSet排序的第二中方式：当元素自身不具备比较性时，或者具备的比较性不是需要的。
就需要让集合自身具备
在集合一初始化时，就有了比较方式


往 TreeSet 集合中存储自定义对象，按照学生的年龄进行排序

排序的时候，当主要条件相同时，一定要判断次要条件。
 */

package Day15;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();

        ts.add(new Student("张三", 21));
        ts.add(new Student("张四", 21));
        ts.add(new Student("王五", 65));
        ts.add(new Student("王五", 65));
        ts.add(new Student("兄弟", 47));




        Iterator it = ts.iterator();
        while (it.hasNext()) {
            Student st = (Student) it.next();
            System.out.println(st.getName() + "....." + st.getAge());

        }
    }
}

//该接口强制让学生具备比较性
class Student implements Comparable {
    private String name;
    private int age;

    Student(String name, int age) {
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

        if (!(obj instanceof Student)) {
            throw new RuntimeException("错误了，不是学生");
        }

//        obj instanceof Student
        Student s = (Student) obj;
        if (this.age > s.age) {
            return 1;
        }
        if (this.age == s.age) {
            return this.name.compareTo(s.name);
        } else {
            return -1;
        }

    }
}
