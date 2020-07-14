/*
Arrays: 用于操作数组的工具类
Arrays里都是静态方法

asList: 将数组变成list集合，可以使用集合的思想和方法来操作数组中的元素
        但是不可以使用集合增删方法，因为数组的长度是固定的

        如果数组中的元素都是对象，那么变成集合时，数组中的元素就直接转成集合中的元素
        如果数组中的元素都是基本数据类型，那么会将该数组作为集合中的元素存在
 */
package Day17;

import java.util.Arrays;
import java.util.List;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6};
        System.out.println("toString: "+Arrays.toString(arr));

        System.out.println("------");

        String[] arr1 = {"abc", "kk", "sdef"};

        //把数组变成list集合，可以使用集合的思想和方法来操作数组中的元素
        //注意：不可以使用集合增删方法，因为数组的长度是固定的
        List <String> list = Arrays.asList(arr1);
        System.out.println("asList: " + list);
        System.out.println("contains: "+list.contains("kk"));

        System.out.println("-------------");

        int[] nums = {2,4,5,7};
        List<int[]> li = Arrays.asList(nums);
        System.out.println(li);

        Integer[] nums1 = {2,4,5,7};
        List<Integer> li1 = Arrays.asList(nums1);
        System.out.println("Integer："+li1);

    }


}
