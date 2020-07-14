/*
需求：对学生对象的年龄进行升序排序

因为数据是以键值对形式存在的
所以要使用可以排序的Map集合。TreeMap
 */
package Day16;

import java.util.*;

public class MapTest2 {
    public static void main(String[] args) {
        TreeMap<Student, String> tm = new TreeMap<>(new NameComp());

        tm.put(new Student("f", 69), "广州");
        tm.put(new Student("b", 21), "北京");
        tm.put(new Student("g", 58), "上海");
        tm.put(new Student("g", 58), "上海");

        tm.put(new Student("a", 69), "福州");
        tm.put(new Student("a", 69), "福州周");


        Set<Map.Entry<Student, String>> entrySet = tm.entrySet();
        Iterator<Map.Entry<Student, String>> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry<Student, String> me = it.next();
            Student student = me.getKey();
            String address = me.getValue();
            System.out.println(student+"..."+address);
        }

    }
}

class NameComp implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        int num = o1.getName().compareTo(o2.getName());
        if (num == 0){
            return new Integer(o1.getAge()).compareTo(new Integer(o2.getAge()));
        }
        return num;
    }
}
