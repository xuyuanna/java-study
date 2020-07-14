package Array;

public class ArrTest {

    public static void main(String[] args) {
        //数组的操作：获取数据。
        //获取数组中的元素。通常都会用到for循环。


        //arr.length 可以获取数组的个数
        int[] arr = new int[]{2, 4, 6, 7, 33, 562, 265};
        System.out.println("length:" + arr.length);

        int sum = 0;
        for (int x = 0; x < arr.length; x++) {
            //System.out.println("arr[" + x + "]=" + arr[x]);
            sum += arr[x];
        }
        System.out.println(sum);

        int[] arr1 = new int[]{2, 5, 6, 88888};
        print(arr);
        print(arr1);


    }

    //定义功能，用于打印数组中的元素，元素间用逗号隔开

    public static void print(int arr[]) {
        System.out.print ("[");
        for (int x = 0; x < arr.length; x++) {
            if (x != arr.length - 1) {
                System.out.print(arr[x] + ",");
            } else {
                System.out.println(arr[x] + "]");

            }

        }
    }


}
