/*
2、Set<Map.Entry<k, v>> entrySet：将map集合中的映射关系存入到了Set集合中，
                                  而这个关系的数据类型就是Map.Entry

   Map.Entry ：
   Entry也是一个接口，它是Map接口中的一个内部接口
 */
package Day16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo3 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("01", "张山1");
        map.put("04", "张山4");
        map.put("03", "张山3");
        map.put("02", "张山2");

        //将map集合中的映射关系取出，存入到Set集合中
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, String>> it = entrySet.iterator();
        while (it.hasNext()){
            Map.Entry<String, String> me = it.next();
            String key = me.getKey();
            String value = me.getValue();
            System.out.println(key + " = " +value);
        }

    }
}

