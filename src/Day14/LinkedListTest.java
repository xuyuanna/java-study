/*
使用LinkedList， 模拟一个堆栈或者队列数据结构
堆栈：先进后出。杯子。
队列：先进先出。水管

 */

package Day14;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.myAdd("java01");
        queue.myAdd("java02");
        queue.myAdd("java03");
        queue.myAdd("java04");

        while (!queue.isNull()) {
            System.out.println(queue.myGet());
        }
    }
}

class Queue {
    private LinkedList link;

    Queue() {
        link = new LinkedList();
    }

    public void myAdd(Object object) {
        link.addLast(object);
    }

    public Object myGet() {
        //堆栈
//        return link.removeLast();

        //队列
        return link.removeFirst();
    }

    public boolean isNull() {
        return link.isEmpty();
    }
}
