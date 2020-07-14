package Array;

public class ArrDemo {

    public static void main(String[] args) {
        /*
        格式1：元素类型[] 数组名 = new 元素类型 [元素个数或者数组长度];
            int[] arr = new int[5];
        格式2：元素类型[] 数组名 = new 元素类型 []{元素，元素，元素……};
            int[] arr = new int[] {3,8,5,……};
            int[] arr = {3,8,5,……};
        */

        //定义一个可以存储3个整数的容器
        int[] x = new int[3];
        x[0]=1;
        x[1]=2;
        x[2]=3;
        ;  //int代表元素的类型，3代表元素的个数， x是数组类型
        //int x [] = new int[3];
        System.out.println(x[1]);

        int[] arr = new int[]{3, 4, 5, 2};
        System.out.println(arr[1]);     //ArrayIndexOutOfBoundsException: 7，操作数组时候，访问到了不存在的角标

        int[] arr1 = {3, 4, 5, 2};
        arr1 = null;
        System.out.println(arr1[0]);        //NullPointerException:空指针异常，当引用没有任何指向值为null的情况，该引用还在用于操作实体。


    }

}
