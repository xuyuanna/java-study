/*
按照字符串长度排序

字符串本身具备比较，但是比较方式不是俺早长度排序
就需要使用比较器
 */

package Day15;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet(new StringLengthCompare());

        ts.add("abcd");
        ts.add("efg");
        ts.add("hijkl");
        ts.add("hijkl");
        ts.add("mn");
        ts.add("zz");
        ts.add("aa");
        ts.add("opqrstuv");

        Iterator it = ts.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

class StringLengthCompare implements Comparator{
    @Override
    public int compare(Object o1, Object o2){
        String s1 = (String)o1;
        String s2 = (String)o2;

//        if(s1.length()>s2.length()){
//            return 1;
//        }else if(s1.length()<s2.length()){
//            return -1;
//        }else{
//            return 0;
//        }

        int num = new Integer(s1.length()).compareTo(new Integer(s2.length()));

        //判断length一样，再判断字符串
        if(num == 0){
            return s1.compareTo(s2);
        }

        return num;
    }
}
