package Array;

import java.util.Arrays;
import java.util.Collections;

public class ArrayTest4 {
    //将一个元素插入到一个有序的数组中,用折半查找法

    public static void main(String[] args) {
        int[] arr = new int[]{2, 5, 8, 14, 23, 50};
        int index = insert(arr, 37);
        System.out.println(index);

    }

    public static int insert(int[] arr, int key) {
        int min = 0, max = arr.length - 1, mid;
        while (min <= max) {
            mid = (min + max) / 2;
            if (key > arr[mid]) {
                min = mid + 1;
            } else if (key < arr[mid]) {
                max = mid - 1;
            } else {
                return mid;
            }
        }
        return min;
    }

}





