public class OverloadDemo {

    public static void main(String[] args) {
        int a = add(8, 9, 10);
        System.out.println(a);

        int b = add(3, 6);
        System.out.println(b);

        mult();
        System.out.println("-------");
        mult(5);
    }

    /*
    函数重载overload，只看（）里面的参数类型和个数。与返回值无关。
     */

    //定义一个函数，获取两个整数的和。
    public static int add(int x, int y) {
        return x + y;
    }

    //定义一个函数，获取3个整数的和。
    public static int add(int x, int y, int z) {
        return x + y + z;
    }

    public static void mult() {
        for (int x = 1; x <= 9; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print(y + "*" + x + "=" + x * y + "\t");
            }
            System.out.println();
        }
    }

    public static void mult(int num) {
        for (int x = 1; x <= num; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print(y + "*" + x + "=" + x * y + "\t");
            }
            System.out.println();
        }
    }
}
