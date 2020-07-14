/*
去除ArrayList集合中的重复元素
 */

package Day14;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        al.add("java05");
        al.add("java03");
        al.add("java02");
        al.add("java04");
        al.add("java04");
        al.add("java02");
//        al.add("java07");
        System.out.println("原："+al);
        System.out.println("singleElement:  "+singleElement(al));
        System.out.println("-------");

        //在迭代时，循环中，next调用一次就要hasNext判断一次
//        for (Iterator it = al.iterator(); it.hasNext();){
//            System.out.println(it.next()+"....."+it.next());
//        }

    }

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
