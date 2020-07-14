/*
|--Set：元素是无序的(存入和取出的顺序不一定一致)，元素不可以重复，该集合没有索引
    |--HashSet：底层数据结构是哈希表
    |--TreeSet：

Set集合的功能和Collection是一致的


 */

package Day14;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet hs = new HashSet();

        hs.add("java01");
        hs.add("java02");
        System.out.println(hs.add("java05"));
        System.out.println("重复："+hs.add("java05"));
        hs.add("java04");


        Iterator it = hs.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
