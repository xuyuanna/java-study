/*
|--Collection
    |--List：元素是有序的，可以重复，因为该集合体系有索引
        |--ArrayList：底层的数据结构使用的是数组结构。可变长度       特点：查询速度很快，但是增删稍慢。线程不同步
        |--LinkedList：底层使用的是链表数据结构。            特点：增删速度很快，查询稍慢
        |--Vector：底层是数组数据结构。和ArrayList功能一样。线程同步。被ArrayList替代了

    |--Set：元素是无序的，不可以重复，该集合没有索引


List：
凡是可以操作角标的方法，都是该体系特有的方法。

增
    add(index, element)
    addAll(index, Collection)
删
    remove(index)
改
    set(index, element)
查 获取
    get(index)
    subList(from, to)
    listIterator()

迭代器：判断，获取，移除

List集合特有的迭代器：ListIterator ，是 Iterator 的子接口。
在迭代时，不可以通过集合对象的方法操作集合中的元素，因为会发生并发修改异常ConcurrentModificationExceptio(并发修改异常)，
所以在迭代时，只能用迭代器的方法来操作元素。可是Iterator的方法是有限的，只能对元素进行判断，取出，删除的操作，
如果想要其他的操作，比如添加修改，就需要使用其子接口 ListIterator
该接口只能通过List集合的l istIterator方法获取
 */
package Day14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
    public static void main(String[] args) {
        method();
        System.out.println("-------------");

        //演示列表迭代器
        ArrayList al = new ArrayList();

        //添加元素
        al.add("java01");
        al.add("java02");
        al.add("java03");


        System.out.println("原：" + al);

        ListIterator li = al.listIterator();

        while (li.hasNext()) {
            Object obj = li.next();

            if (obj.equals("java02")) {
//                li.add("java002");
                li.set("java006");
            }
        }
        //循环完，后一个元素
        System.out.println("hasNext: "+ li.hasNext());
        //前一个元素
        System.out.println("hasPrevious: "+ li.hasPrevious());

        System.out.println("Next后：" + al);

        while (li.hasPrevious()) {
                System.out.println("pre: "+li.previous());
            }

        }

//        System.out.println("hasNext: "+ li.hasNext());
//        System.out.println("hasPrevious: "+ li.hasPrevious());
//
//
//        System.out.println("Previous后：" + al);


        //在迭代过程中，准备添加或删除元素
//        for (Iterator it = al.iterator(); it.hasNext(); ) {
//            Object obj = it.next();
//            if (obj.equals("java02")) {
//
//                //将java02的引用从集合中删除。
//                it.remove();
//            }
//            System.out.println("obj = " + obj);
//        }
//        System.out.println("后：" + al);


    public static void method() {
        ArrayList al = new ArrayList();

        //添加元素
        al.add("java01");
        al.add("java02");
        al.add("java03");

        System.out.println("原集合是：" + al);

        //在指定位置添加元素
        al.add(1, "java09");
        System.out.println("add：" + al);

        //删除指定位置的元素
//        al.remove(2);
//        System.out.println("删除 ："+al);

        //修改元素
        al.set(2, "java007");
        System.out.println("set(2)：" + al);

        //通过角标获取元素
        System.out.println("get(1)：" + al.get(1));

        //获取所有元素
        for (int i = 0; i < al.size(); i++) {
            System.out.println("al(" + i + ")：" + al.get(i));
        }

        for (Iterator it = al.iterator(); it.hasNext(); ) {
            System.out.println("iterator next: " + it.next());
        }

        //通过indexOf获取对象的位置
        System.out.println("index = 0" + al.indexOf("java007"));


        //subList 返回指定的位置，包含1，不包含4
        List sub = al.subList(1, 4);
        System.out.println("sub = " + sub);
    }
}
