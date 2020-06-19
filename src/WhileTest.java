public class WhileTest {
    public static void main(String[] args) {
        //循环结构
        //while，do while，for
        //do while 无论条件是否满足，循环体至少被执行一次。
        int a = 0;

        /*while
        定义初始化表达式
        while(条件表达式){
            循环体/执行语句;
        }
        先判断再执行
         */
        while (a < 4) {
            a++;
            System.out.println("a=" + a);
            //a++;
        }

        //do while
        //先执行再判断，最少执行一次
        do {
            System.out.println(a);
        } while (a-- > 0);

        int b = 3;
        do {
            System.out.println(b);
        } while (b > 5);

        /*
        for循环
        for(初始化表达式；循环条件表达式；循环后的操作表达式)
        {
            执行语句
        }
        执行步骤： 1、初始化表达式 2、循环条件表达式 3、执行语句 4、循环后的操作表达式
        初始化表达式只执行一次,可以不写
        条件表达式必须要为真假
        多个表达式用逗号隔开
         */
        for (int c = 1; c < 4; c++) {
            System.out.println("c=" + c);
        }
        //System.out.println("c==="+c);

        int d = 1;
        while (d < 4) {
            System.out.println("d=" + d);
            d++;
        }
        System.out.println("d===" + d);

        /*
        1，变量有自己的作用域。对于for，如果将用于控制循环的增量定义在for语句中，那么该变量只在for语句中有效。
        for语句执行完毕，该变量在内存中被释放。

        2，for和while可以互换，如果需要定义循环增量，用for更为合适。
         */

        int x = 1;
        for (System.out.println("a"); x < 3; System.out.println("c")) {
            System.out.println("d");
            x++;
        }
        //adcdc

        for (int y = 0; y < 3; y++) {
            System.out.println("y1");
        }

        int y = 0;
        for (; y < 3; ) {
            y++;
            System.out.println("y2");
        }

        /*
        无限循环的最简单表现形式：
        for(;;){} 不写条件表达式，默认就是true

        while(true){}
         */
    }
}
