package Array;/*
    冒泡排序
 */

import java.util.Arrays;

public class ArrayTest2 {

    public static void main(String[] args) {

        int[] arr = new int[]{24, 2, 18, 98, 66, 4};
        ArrayTest2.sort(arr);

        int[] arr2 = new int[]{33, 5, 14, 87, 56, 9};
        ArrayTest2.sort(arr2);

        int[] arr3 = new int[]{3434, 11, 444552344, 63125257, 63231, 41553};
        Arrays.sort(arr3);
        pinrtArray(arr3);
    }

    private static void pinrtArray(int[] arr3) {
        for (int i : arr3) {
            System.out.print(i + ",");
        }
    }

    public static void sort(int[] arr) {
        for (int x = 0; x < arr.length - 1; x++) {
            for (int y = 0; y < arr.length - x - 1; y++) {  //-x:让每一次比较的元素减少（最后），避免角标越界
                if (arr[y] > arr[y + 1]) {      //相邻的元素相比较
                    int temp = arr[y];
                    arr[y] = arr[y + 1];
                    arr[y + 1] = temp;
                }
            }
        }
        print(arr);
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print("[" + arr[i] + ",");
            } else if (i != arr.length - 1) {
                System.out.print(arr[i] + ",");
            } else {
                System.out.print(arr[i] + "]");
            }
        }
        System.out.println();
    }

}
