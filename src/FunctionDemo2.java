public class FunctionDemo2 {

    public static void main(String[] args) {
        int sum = add(4, 5);
        System.out.println("sum=" + sum);

        boolean x = getSame(8, 8);
        System.out.println(x);

        int big = getBig(64, 33);
        System.out.println("大的数字是" + big);

    }

    /*
    如何定义函数？
    1、先明确该功能运算的结果。这是在明确函数的返回值类型
    2、再明确在定义该功能的过程中是否需要未知的内容参与运算。
    因为是在明确函数的参数列表（参数的类型和个数）
     */

    //需求：定义一个功能完成3+4的运算，并将结果返回给调用者。
    public static int add(int a, int b) {
        return a + b;
    }

    //需求：判断两个数是否相同
    public static boolean getSame(int a, int b) {
        //return (a == b) ? true : false;
        return a == b;
    }

    //需求：对两个数字进行比较，获取较大的数。
    public static int getBig(int a, int b) {
        return (a > b) ? a : b;
    }


}
