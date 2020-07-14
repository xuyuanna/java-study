package Array;/*
给定一个数组，{12，53，22，6，46，78}
获取数组中的最大值和最小值

1、定义变量，初始化值为数组中的任意一个元素即可。
2、通过循环语句对数组进行遍历
3、在变量过程中定义判断条件，如果遍历到的元素b比变量中的元素大，就赋值给该变量。

需要定义一个功能来完成
 */

public class ArrTest2 {

    public static void main(String[] args) {

        int[] arr = new int[]{55, 53, 22, 6, 46, -78};
        getNum(arr);

    }

    public static void getNum(int[] arr) {
        //获取最值
        System.out.println("该数组最大的值元素是" + getMax(arr)+"，最小的元素是" + getMin(arr) + "。");
    }

    public static int getMin(int[] arr) {
        int min = 0;
        for (int x = 0; x < arr.length; x++) {
            if (arr[min] > arr[x]) {
                arr[min] = arr[x];
            }
        }
        return arr[min];
    }

    public static int getMax(int[] arr) {
        int max = 0;
        for (int x = 0; x < arr.length; x++) {
            if (arr[max] < arr[x]) {
                arr[max] = arr[x];
            }
        }
        return arr[max];
    }

}
