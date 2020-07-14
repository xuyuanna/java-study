/*
练习：
 每一个学生都有对应的归属地

 注意：姓名和年龄相同的视为同一个学生
 保证学生的唯一性

 1、描述学生
 2、定义map容器，将学生作为键，地址作为值，存入
 3、获取map集合中的元素
 */

package Day16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {

    public static void main(String[] args) {
        HashMap<Student, String> map = new HashMap<>();
        map.put(new Student("张三", 21), "北京");
        map.put(new Student("李四", 58), "上海");
        map.put(new Student("王五", 69), "广州");
        map.put(new Student("王五", 69), "广州");



        //第一种取出方式 keySet
        Set<Student> keySet = map.keySet();
        Iterator<Student> it = keySet.iterator();
        while (it.hasNext()) {
            Student student = it.next();
            String address = map.get(student);
            System.out.println(student + "...." + address);
        }

        System.out.println("-----------------");

        //第2种取出方式 entrySet
        Set<Map.Entry<Student, String>> entrySet = map.entrySet();
        Iterator<Map.Entry<Student, String>> it2 = entrySet.iterator();
        while (it2.hasNext()) {
            Map.Entry<Student, String> me = it2.next();
            Student stu = me.getKey();
            String addr = me.getValue();
            System.out.println(stu + "......." + addr);

        }
    }
}

class Student {
    private String name;
    private int age;

    Student(String name, int age) {
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


    //hashCode不同，两个对象不同，hashCode相同，两个对象不一定相同

    //去除重复
    @Override
    public int hashCode() {
        return name.hashCode() + age * 21;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Student)) {
            throw new ClassCastException("类型不匹配！");
        }

        Student s = (Student) obj;
        return this.name.equals(s.name) && this.age == s.age;
    }

    @Override
    public String toString() {
        return name + ".." + age;
    }


}
