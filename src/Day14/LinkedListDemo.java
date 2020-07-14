/*
LinkedList 特有方法：
如果集合中没有元素，get和remove会抛出异常

addFirst()
addLast()

getFirst()
getLast()
获取元素但不删除元素

removeFirst()
removeLast()
获取元素，并且删除
------------------------------------------

JDK1.6 出现了替代方法
如果集合中没有元素，peek和poll会返回null
获取,不删除元素
peekFirst()
peekLast()

获取，并删除元素
pollFirst()
pollLast()

插入元素
offerFirst()
offerLast()
 */

package Day14;


import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList link = new LinkedList();

        link.addFirst("java001");
        link.addFirst("java002");
        link.addFirst("java003");
        link.addFirst("java004");

        //004 003 002 001
        System.out.println(link);

        System.out.println("getFirst: " + link.getFirst());
        System.out.println("getLast: " + link.getLast());
        System.out.println("size: " + link.size());

        System.out.println("remove First1: " + link.removeFirst());
        System.out.println("remove First2: " + link.removeFirst());

        System.out.println(link.size()+": "+link);

        //清空
        while(!link.isEmpty()){
            System.out.println(link.removeFirst());
//            System.out.println(link.removeLast());
        }
        System.out.println("清空："+link);
    }
}
