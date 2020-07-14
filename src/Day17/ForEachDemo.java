/*
高级for循环：
格式：
for(数据类型 变量名:被遍历的集合(Collection)或者数组){
}
对集合进行遍历，只能获取集合中的元素，但是不能对集合进行操作

 迭代器除了遍历，还能进行remove集合中元素的动作。
 如果使用ListIterator，还可以在遍历过程中，对集合进行增删改查的动作

 传统for和高级for有什么区别：
 高级for有局限性，必须有被遍历的目标。
 建议在遍历数组的时候，还是使用传统for，因为传统for可以定义角标

 */
package Day17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ForEachDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("abc1");
        al.add("abc2");
        al.add("abc3");
        System.out.println("ArrayList:");
        for (String s : al) {
            System.out.println(s);
        }

        System.out.println();

        int[] arr = {3, 5, 11};

        System.out.println("int[]arr:");

        for (int i : arr) {
            System.out.println(i);
        }

        for (int x = 0; x < arr.length; x++) {
            System.out.println(arr[x]);
        }

        System.out.println();

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "a");
        hashMap.put(2, "b");
        hashMap.put(3, "c");

        System.out.println("HashMap:");
        Set<Integer> keySet = hashMap.keySet();
        for (Integer i : keySet) {
            System.out.println(i + " : " + hashMap.get(i));
        }

        for (Map.Entry<Integer, String> me : hashMap.entrySet()) {
            System.out.println(me.getKey()+"..."+me.getValue());
        }
    }
}
