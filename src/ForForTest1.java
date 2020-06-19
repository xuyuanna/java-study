public class ForForTest1 {
    public static void main(String[] args) {

    /*
    1
    12
    123
    1234
    12345
    123456
     */
        for (int x = 0; x < 6; x++) {
            for (int y = 1; y - x < 2; y++) {
                System.out.print(y);
            }
            System.out.println();
        }

        System.out.println("----------------------");
        /*
        九九乘法表
        1*1=1
        1*1=2 1*2=2
        1*1=2 1*2=2 1*3=3
        ………………………………………………
        */

        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print(b + "*" + a + "=" + b * a + "\t");
            }
            System.out.println();
        }


    }
}
