package Day17;

import java.util.*;

public class CollectionDemo2 {
    public static void main(String[] args) {
        replaceAllDemo();
        System.out.println("--------------------");
        orderDemo();
        System.out.println("--------------------");
        shuffleDemo();
    }

    public static void shuffleDemo(){
        List<String> list = new ArrayList<>();
        list.add("hijkl");
        list.add("abcd");
        list.add("awdvdsv");
        list.add("mn");
        list.add("zzz");

        System.out.println("list: "+list);

        //随机排序集合中的元素
        Collections.shuffle(list);
        System.out.println("shuffle: "+list);
    }

    public static void orderDemo() {
        //逆向  Collections.reverseOrder()
        TreeSet<String> treeSet = new TreeSet<>(Collections.reverseOrder(new LengthComparator()));
        treeSet.add("efg");
        treeSet.add("hijkl");
        treeSet.add("abcd");
        treeSet.add("mn");

        Iterator it = treeSet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

    public static void replaceAllDemo() {
        List<String> list = new ArrayList<>();
        list.add("hijkl");
        list.add("abcd");
        list.add("mn");
        list.add("zzz");

        System.out.println("list: " + list);

        Collections.replaceAll(list, "mn", "pp");
        System.out.println("replaceAll: " + list);

        Collections.reverse(list);
        System.out.println("reverse: " + list);
    }
}

//class TreeSetComp implements Comparator<String>{
//    @Override
//    public int compare(String s1, String s2) {
//        return s2.compareTo(s1);
//    }
//}
