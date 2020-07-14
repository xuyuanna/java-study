/*
集合框架的工具类
Collections:
 */

package Day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        sortDemo();

        System.out.println("---------------");
        maxDemo();

        System.out.println("---------------");
        binarySearhDemo();
    }

    public static void binarySearhDemo(){
        List<String> list = new ArrayList<>();
        list.add("hijkl");
        list.add("abcd");
        list.add("mn");
        list.add("zzz");
        list.add("z");
        list.add("efg");
        list.add("efg");

        Collections.sort(list);
        System.out.println(list);

        int index = Collections.binarySearch(list,"mn");
        System.out.println("binarySearch: "+index);

        // 不存在的，返回 ： (-插入点) -1
        int index1 = Collections.binarySearch(list,"zz");
        System.out.println("binarySearch: "+index1);

        int index2 = Collections.binarySearch(list,"a",new LengthComparator());
        System.out.println("binarySearch: "+index2);

    }

    public static void maxDemo() {
        List<String> list = new ArrayList<>();
        list.add("hijkl");
        list.add("abcd");
        list.add("mn");
        list.add("zz");
        list.add("z");
        list.add("efg");
        list.add("efg");
        String max = Collections.max(list);
        System.out.println("max: "+max);

        String lengthMax = Collections.max(list, new LengthComparator());
        System.out.println("lengthMax: "+lengthMax);

    }

    public static void sortDemo() {
        List<String> list = new ArrayList<>();
        list.add("hijkl");
        list.add("abcd");
        list.add("mn");
        list.add("zz");
        list.add("efg");
        list.add("efg");

        System.out.println("排序前：" + list);

        Collections.sort(list);
        System.out.println("排序后：" + list);

        Collections.sort(list, new LengthComparator());
        System.out.println("比较器排序后：" + list);

        Collections.swap(list,1,2);
        System.out.println("swap: "+list);
    }
}

class LengthComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return 1;
        }
        if (s1.length() < s2.length()) {
            return -1;
        } else {
            return s1.compareTo(s2);
        }
    }
}

