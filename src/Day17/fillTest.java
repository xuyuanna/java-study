/*
fill方法可以将list集合中的所有元素替换成指定元素

练习
将list集合中部分元素替换成指定元素
 */
package Day17;

import java.util.ArrayList;
import java.util.List;

public class fillTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hijkl");
        list.add("abcd");
        list.add("mn");
        list.add("zzz");
        System.out.println("list: " + list);
        List lister = fillDemo(list,"pp",1,2);
        System.out.println("lister: "+lister);
    }

    public static List fillDemo(List<String> list, String str, int start, int end) {
        for (int i = start; i <= end; i++) {
            list.set(i, str + "+" + i);
        }
        return list;
    }
}
