/*
集合变数组
Collection接口中的toArray方法

 */
package Day17;

import java.util.ArrayList;
import java.util.Arrays;

public class ToArrayDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("abc1");
        al.add("abc2");
        al.add("abc3");

        /*
        1、指定类型的数组，要定义多长？：
        当指定类型的数组长度小于集合的size，那么该方法内部会创建一个新的数组，长度为集合的size
        当指定类型的数组长度大于集合的size，空位置为nullal.size()

        2、为什么要将集合变成数组？
        为了限定对元素的操作.不需要进行增删了。
         */

        String[] arr = al.toArray(new String[al.size()]);

        System.out.println(Arrays.toString(arr));
        System.out.println(arr);


        System.out.println("===================");

        ArrayList<Person> pa = new ArrayList<>();
        pa.add(new Person("xcf"));
        pa.add(new Person("xyn"));

        System.out.println(Arrays.toString(pa.toArray()));
    }
}


class Person extends Object {
    private String name;

    Person() {
    }

    Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
