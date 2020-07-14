package Day15;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class GenericDemo2 {
    public static void main(String[] args) {
        TreeSet <String> ts = new TreeSet<>(new GenericComparator());

        ts.add("abcd");
        ts.add("efg");
        ts.add("hijkl");
        ts.add("mn");
        ts.add("aa");
        ts.add("opqrstuv");

        Iterator <String> it = ts.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
    }
}

//class GenericComparator implements Comparator {
//    @Override
//    public int compare(Object o1, Object o2) {
//        String s1 = (String)o1;
//        String s2 = (String)o2;
//        int num = new Integer(s2.length()).compareTo(new Integer(s1.length()));
//        if(num == 0){
//            return s2.compareTo(s1);
//        }
//        return num;
//    }
//}

class GenericComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {

        int num = new Integer(s2.length()).compareTo(new Integer(s1.length()));
        if(num == 0){
            return s2.compareTo(s1);
        }
        return num;
    }
}
