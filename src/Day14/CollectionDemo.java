/*
1、add方法的参数类型是Object，以便于接收任意类型对象
2、集合中存储的都是对象的引用（地址）

什么是迭代器：
就是集合的取出元素的方式。

 */

package Day14;


import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        base_method();
        System.out.println("-------");

        method();
        System.out.println("-------");

        method_get();
        System.out.println("-------");

    }

    public static void base_method() {
        //创建一个集合容器，使用Colletion接口的子类。ArrayList
        ArrayList al = new ArrayList();

        //1添加元素
        al.add("java01");
        al.add("java02");
        al.add("java03");

        //打印原集合
        System.out.println("原集合：" + al);

        //删除元素
        al.remove("java02");
//        al.clear();

        //获取个数，集合长度
        System.out.println("size : " + al.size());

        //打印原集合
        System.out.println(al);

        //判断元素
        System.out.println("判断：" + al.contains("java03"));
        System.out.println("为空：" + al.isEmpty());
    }

    public static void method() {
        ArrayList al1 = new ArrayList();
        al1.add("java01");
        al1.add("java02");
        al1.add("java03");
        al1.add("java04");

        ArrayList al2 = new ArrayList();
        al2.add("java03");
        al2.add("java04");
        al2.add("java05");
        al2.add("java06");

        //取交集，al1中只会保留和al2中相同的元素
        //al1.retainAll(al2);

        //al1移除相同的元素
        al1.removeAll(al2);

        System.out.println("al1：" + al1);
        System.out.println("al2：" + al2);

        System.out.println("retain：");

    }

    public static void method_get() {
        ArrayList al = new ArrayList();
        al.add("java01");
        al.add("java02");
        al.add("java03");
        al.add("java04");

        //获取迭代器，用于取出集合中的元素
//        Iterator iterator = al.iterator();
//
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        for (Iterator it = al.iterator(); it.hasNext(); ) {
            System.out.println(it.next());
        }
    }

}
