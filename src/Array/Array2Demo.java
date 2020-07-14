package Array;

public class Array2Demo {
    public static void main(String[] args){
        //定义了一个名称为arr的二维数组，二维数组中有【2】个一维数组，每个一维数组中有【3】个元素。
        //int[]x,y[]   --->x是一维数组，y是二维数组

        //求二维数组里面所有元素的和
        int[][] arr = {{1,2,3,4},{5,6,7,8},{5,2,5,4}};
        int sum = getSum(arr);
        System.out.println("sum="+sum);


        int[][] arr1 = new int[3][];
        arr1[1]=new int[3];
        //null.元素的默认初始化值是0，数组是null
        System.out.println(arr1[0]);
        //0
        System.out.println(arr1[1][1]);
    }

    public static int getSum(int[][] arr){
        int sum= 0;
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr[x].length; y++) {
                sum += arr[x][y];
            }
        }
         return sum;
    }
}
