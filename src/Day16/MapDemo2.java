/*
map集合的两种取出方式
1、Set<k>keySet：将map中所有的键存入到Set集合，因为set具备迭代器，所以可以用迭代方式取出所有的键，
            再根绝get方法，获取每一个键对应的值
      Map集合的取出原理：将map集合转成set集合，再通过迭代器取出

2、Set<Map.Entry<k, v>> entrySet：将map集合中的映射关系存入到了Set集合中，
                                  而这个关系的数据类型就是Map.Entry
 */

package Day16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("01", "张山1");
        map.put("04", "张山4");
        map.put("03", "张山3");
        map.put("02", "张山2");

        ///先获取map集合中的所有键的Set集合，keySet()
        Set<String> keySet = map.keySet();

        //获取其迭代器
        Iterator<String> it = keySet.iterator();
        while (it.hasNext()) {
            String key = it.next();
            String value = map.get(key);
            System.out.println("key : " + key + ", value : " + value);
        }
    }
}
