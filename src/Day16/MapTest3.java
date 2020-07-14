package Day16;

import java.util.*;

public class MapTest3 {
    public static void main(String[] args) {
        String s = "urf6gfr6gudr56dgtufgr5dfeurgthgedfr5tgh6hedrftgh6";
        char[] chs = s.toCharArray();

        TreeMap<Character, Integer> treemap = new TreeMap<>();
        for (int i = 0; i < chs.length; i++) {

            Character key = chs[i];
            Integer value = treemap.get(key);

            if (!treemap.containsKey(key)) {
                // 第一次插入，数量1
                treemap.put(key, 1);
            } else {
                // 已经存在的情况，++value
                treemap.put(key, ++value);
            }
        }


        Set<Map.Entry<Character, Integer>> entries = treemap.entrySet();
        Iterator<Map.Entry<Character, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Character, Integer> me = iterator.next();
            System.out.println(me.getKey() + " : " + me.getValue());

        }

        System.out.println("=========================");

        treemap.forEach((k, v) -> {
            System.out.println(k + " : " + v);
        });


    }
}
