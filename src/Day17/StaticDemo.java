/*
StaticImport  静态导入

当类名重名时，要指定具体的包名
当方法重名时，要指定具备所属的对象或者类

import static   导入这个类中所有的静态成员
 */
package Day17;

//导入的是Arrays这个类中的所有静态成员
import static java.util.Arrays.*;

//导入了System类所有的静态成员
import static java.lang.System.*;

public class StaticDemo {
    public static void main(String[] args) {
        int[] arr = {43, 15, 76};
        sort(arr);

        int index = binarySearch(arr, 43);
        System.out.println("index: " + index);

        out.println("index: " + index);
    }
}
