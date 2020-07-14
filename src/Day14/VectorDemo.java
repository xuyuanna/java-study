/*
枚举是Vector特有的取出方法
枚举和迭代是一样的。枚举的名称以及方法的名称都过长，所以被取代
 */

package Day14;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add("01");
        vector.add("02");
        vector.add("03");
        vector.add("04");

        System.out.println(vector.get(2));
        System.out.println(vector.elementAt(2));

        System.out.println("-----");

        //枚举
        Enumeration enumeration = vector.elements();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }
}
