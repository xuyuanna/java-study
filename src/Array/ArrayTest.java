package Array;

public class ArrayTest {

    public static void main(String[] args) {
        int[] arr = new int[]{7, 3, 16, 74, 22, 2};
        sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print("[" + arr[i]+",");
            } else if (i != arr.length - 1) {
                System.out.print(arr[i] + ",");
            } else {
                System.out.print(arr[i] + "]");
            }
        }
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int x = i + 1; x < arr.length; x++) {
                if (arr[i] > arr[x]) {
                    swap(arr, i, x);
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int x) {
        int temp = arr[x];
        arr[x] = arr[i];
        arr[i] = temp;
    }
}
