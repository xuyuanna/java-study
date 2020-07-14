package Day1_9;/*
StaticTool
用类名调用
 */

public class StaticDemo3 {
    public static void main(String[] args) {
        int[] arr = {7, 2, 16, 12, 4646, 245};
        int[] arr2 = {2, 1, 56, 516};

        //Day1_9.Tool tool = new Day1_9.Tool();

        int max = Tool.getMax(arr);
        System.out.println("max=" + max);


        int min = Tool.getMin(arr);
        System.out.println("min=" + min);

        Tool.print(arr);

        int max2 = Tool.getMax(arr2);
        System.out.println(max2);
    }


}