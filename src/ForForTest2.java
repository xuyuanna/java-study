/*

----*
---* *
--* * *
-* * * *
* * * * *

*/

public class ForForTest2 {
    public static void main(String[] args) {

        for (int x = 0; x < 5; x++) {

            for (int y = 5; y - 1 > x; y--) {
                System.out.print(" ");
            }

            for (int z = 0; z <=x; z++) {
                System.out.print("* ");
            }

            System.out.println();

        }

        System.out.println("你好");

    }
}
