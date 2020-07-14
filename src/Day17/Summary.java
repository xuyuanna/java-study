package Day17;

import java.util.HashSet;
import java.util.Objects;
import java.util.Properties;

/**
 * List: 有顺序（插入顺序），线性结构实现=arrayList；链式结构实现=linkedList
 * ArrayList:
 *      底层是数组，所以它的特性几乎跟数组完全一样，只是arrayList封装了数组，提供了更加简单的操作方法；
 *      ArrayList是有序的，按照插入顺序。
 *      问：如果一个数组有10个元素，我想要在中间第五个角标插入一个元素，那我需要做什么操作：
 *              将第五个元素放到第六位，第六个放到第七个，以此类推。慢！！！add(int index, E element)
 *      问：如果一个arrayList要删除一个元素，需要做什么操作？
 *              被删除元素的后面的元素要往前移1位，慢！！！remove()
 *      问：如果要查询一个arrayList第N个元素？
 *              直接根据角标查询，很快！！！.indexOf()
 *
 * LinkedList:
 *      底层是node节点，每个node节点有prev跟next代表前置节点跟后置节点，linkedList提供了firstNode跟lastNode方便查询
 *      问：查询linked list第N个节点是一个什么过程?
 *              首先判断这个节点靠近firstNode还是lastNode，从靠近的那个节点出发，挨个获取下一个或者上一个节点，直到遇到index为止。get（index），慢！！！
 *      问：插入一个元素到某个位置是一个什么过程？
 *              将前面那个节点的next改为新节点，将原来后面那个节点的prev改成新节点，并且新节点的prev是原来前面那个节点，新节点的next是原来后面那个节点。快！！！add()
 *      问：删除一个节点？
 *              跟插入一样。速度快!!!remove()
 *
 * Set:无序（遍历顺序跟插入顺序不同，虽然插入完成之后，每次遍历的顺序一样，这个无序是跟插入顺序做对比的！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！）
 *      不可重复
 *
 *
 */
public class Summary {

    public static void main(String[] args) {
        HashSet<Person> people = new HashSet<>();
        people.add(new Person("张三"));
        people.add(new Person("王五"));
        people.add(new Person("王五1"));
        people.add(new Person("晓力"));

        people.stream().forEach(System.out::println);
    }

    private static class Person {
        public String name;
        private Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }

}


