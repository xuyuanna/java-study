package Day1_9;/*
break：应用于选择结构和循环结构。continue：只能作用于循环结构。
break和continue单独存在时，下面不可以有任何语句，因为执行不到。
 */

public class BreakContinueTest {
    public static void main(String[] args) {

        //break：应用于选择结构和循环结构。
        w:
        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                System.out.println("x=" + x);
                break w;  //跳出循环,wq是标号，只能用于循环，给循环起名字
            }
        }

        System.out.println("------------------");

        //continue：只能作用于循环结构，继续循环。特点:结束本次循环，继续下一次循环
        for (int x = 0; x < 3; x++) {
            //continue 下面不执行
            System.out.println("x=" + x);
            continue;  //继续循环
        }

        System.out.println("------------------");


        for (int x = 1; x <= 10; x++) {
            if (x % 2 == 1) {
                continue;   //单数继续循环，不执行下面的语句
            }
            System.out.println("x=" + x);
        }

        System.out.println("------------------");

        w:
        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                System.out.println("x=" + x);
                continue w;
            }
        }

    }
}
