/*
Map(key, value)
Map集合：该集合存储键值对，一对一对存，而且要保证键的唯一性

1、添加
    put(Key key, Value value)
    putAll(Map <? extends K, ? extends V> m)

2、删除
    clear()
    remove(Object Key)
3、判断
    containsValue(Object Value)
    containsKey(Object Key)
    isEmpty()
4、获取
    get(Object Key)
    size()
    values()

    entrySet()
    keySet()

--Map
    |--Hashtable：底层是哈希表数据结构，不可以存入null键null值，该集合是线程同步的，JDK1.0 效率低
    |--HashMap：底层是哈希表数据结构，可以存入null键null值，该集合是不同步的，JDK 1.2 效率高
    |--TreeMap：底层是二叉树数据结构，线程不同步。可以用于map集合中的键进行排序
Set集合底层就是使用了Map集合


*/

package Day16;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        //添加元素.
        //存入相同的键，新的值会覆盖原有的值，put会返回被覆盖的值
        map.put("01", "张山1");
        map.put("01", "张山11");
        map.put("02", "张山2");
        map.put("03", "张山3");
        System.out.println("原：" + map);

        System.out.println("containsKey：" + map.containsKey("02"));
        System.out.println("containsValue：" + map.containsValue("张山2"));

        System.out.println("remove : " + map.remove("02"));
        System.out.println("remove : " + map.remove("08"));
        System.out.println(map);

        //可以通过get方法的返回值是否为null，来判断一个键是否存在
        System.out.println("get : " + map.get("03"));
        System.out.println("get : " + map.get("08"));

        //获取map集合中所有值
        Collection<String> coll = map.values();
        System.out.println(coll);


    }
}
