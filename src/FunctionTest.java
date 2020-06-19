public class FunctionTest {

    public static void main(String[] args) {
        draw(4, 9);
        System.out.println("------------");
        mult();

    }

    /*
    需求：打印一个矩形。
    没有具体的返回值，所以返回值类型是void。矩形的 行row 和 列col 不确定。
    */
    public static void draw(int row, int col) {
        for (int x = 0; x < row; x++) {
            for (int y = 0; y < col; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
    需求：定义一个打印99乘法表的函数
     */
    public static void mult() {
        for (int x = 1; x <= 9; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print(y + "*" + x + "=" + x * y + "\t");
            }
            System.out.println();
        }
    }
}
