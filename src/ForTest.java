/*
    1，获取1~10的和，并打印。
    2，1~100之间7的倍数的个数，并打印。
 */
public class ForTest {
    public static void main(String[] args) {

        //获取1~10的和
        //计数器思想：通过一个变量来记住数据的状态变化，也需要通过状态变化。
        int x = 1, sum = 0;
        /*while (x <= 10) {

            sum += x;
            x++;
        }
        System.out.println("1~10的和为"+sum);*/

        for (; x <= 10; x++) {
            sum += x;
        }
        System.out.println("1~10的和为" + sum);


        //1~100之间7的倍数的个数
        //累加思想：通过变量记录每次变化的结果。通过循环的方式，进行累加动作。
        /*
        1、先对1~100进行遍历，通过for循环的方式，定义循环语句。
        2、在过程中，定义条件，只对7的倍数进行操作。
        3、通过一个变量来记录这个变化的次数，定义变量，该变量随着7的倍数的出现而自增。
         */
        int y = 1, count = 0;
        for (; y <= 100; y++) {
            if (y % 7 == 0) {
                count++;
            }
        }
        System.out.println("1~100以内7的倍数有" + count + "个 ");

    }
}
