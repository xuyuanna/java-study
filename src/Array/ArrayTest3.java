package Array;

public class ArrayTest3 {

    //数组的查找操作
    public static void main(String[] args) {

        /*
        int[ ] arr = new int[] {2,4,8,7,8,9};
        int index = getIndex(arr,8);  //22---->-1
        System.out.println("index="+index);
        */

        int[] arr = new int[]{2, 4, 5, 7, 8, 9};
        int key = halfSearch(arr, 2);
        System.out.println(key);

        int[] arr2 = new int[]{2, 42, 52, 72, 28, 9};
        int key1 = halfSearch_2(arr2, 5299);
        System.out.println(key1);
    }

    /*
    折半查找：必须要保证该数组是有序的数组
     */
    public static int halfSearch(int[] arr, int key) {
        int min = 0, max = arr.length - 1, mid = max / 2;

        while (arr[mid] != key) {
            if (key > arr[mid]) {
                min = mid + 1;
            } else if (key < arr[mid]) {
                max = mid - 1;
            }
            if (min > max) {
                return -1;
            }
            mid = (min + max) / 2;
        }
        return mid;

    }

    public static int halfSearch_2(int[] arr, int key1) {
        int min = 0, max = arr.length - 1, mid;

        while (min <= max) {
            mid = (min + max) /2;
            if (key1 < arr[mid]) {
                max = mid + 1;
            } else if (key1> arr[mid]) {
                min = mid+1;
            }else{
                return mid;
            }
        }

        return -1;
    }


    //获取key在数组中第一次出现的位置
    public static int getIndex(int[] arr, int key) {
        for (int x = 0; x < arr.length; x++) {
            if (key == arr[x]) {
                return x;
            }
        }
        return -1;
    }

}
