package Day1_9;

public class IfTest {
    public static void main(String[] args) {

        //需求：根据用户定义的数值，打印对应的星期英文
        int num = 6;
        if (num % 7 == 0) {
            System.out.println("Today is Sunday!");
        } else if (num % 7 == 1) {
            System.out.println("Today is Monday!");
        } else if (num % 7 == 2) {
            System.out.println("Today is Tuesday!");
        } else if (num % 7 == 3) {
            System.out.println("Today is Wednesday!");
        } else if (num % 7 == 4) {
            System.out.println("Today is Thursday!");
        } else if (num % 7 == 5) {
            System.out.println("Today is Friday!");
        } else if (num % 7 == 6) {
            System.out.println("Today is Saturday!");
        }

        //需求：根据不同的月份，打印出所属的季节
        //345春 678夏 91011秋 1212冬
        int mon = 11;

        if (mon == 3 || mon == 4 || mon == 5) {
            System.out.println(mon + "月份是春季！");
        } else if (mon == 6 || mon == 7 || mon == 8) {
            System.out.println(mon + "月份是夏季！");
        } else if (mon == 9 || mon == 10 || mon == 11) {
            System.out.println(mon + "月份是秋季！");
        } else if (mon == 12 || mon == 1 || mon == 2) {
            System.out.println(mon + "月份是冬季！");
        } else {
            System.out.println(mon + "月份不存在，请输入正确的月份！");
        }

        if (mon > 12 || mon < 1) {
            System.out.println(mon + "月份不存在，请输入正确的月份！");
        } else if (mon >= 3 && mon <= 5) {
            System.out.println(mon + "月份是春季！");
        } else if (mon >= 6 && mon <= 8) {
            System.out.println(mon + "月份是夏季！");
        } else if (mon >= 9 && mon <= 11) {
            System.out.println(mon + "月份是秋季！");
        } else {
            System.out.println(mon + "月份是冬季！");
        }

        //switch语句
        int x = 2;

        switch (x)  //支持四种类型：byte short int char
        {
            default:
                System.out.println("什么都不是");
                break;  //default的break可以省略
            case 2:
                System.out.println("这个是" + x);
                break;
            case 4:
                System.out.println("这个是" + x);
                break;
            case 6:
                System.out.println("这个是" + x);
                break;

        }

        int a = 4, b = 2;
        char ch = '+';
        switch (ch) {
            case '-':
                System.out.println(a - b);
                break;
            default:  //default位置可以随意，但是是最后执行的
                System.out.println("什么都没有");
                break;
            case '+':
                System.out.println(a + b);
                break;

        }

        int c = 3;
        switch (c) {
            default:
                System.out.println("d");
                //break;  //default的break可以省略
            case 2:
                System.out.println("a");
                //break;
            case 4:
                System.out.println("b");
                break;
            case 6:
                System.out.println("c");
                break;
        }

        //switch季节
        int mon1 = 6;
        switch (mon1) {
            case 3:
            case 4:
            case 5:
                System.out.println(mon1 + "春季");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println(mon1 + "夏季");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println(mon1 + "秋季");
                break;

            case 12:
            case 1:
            case 2:
                System.out.println(mon1 + "冬季");
                break;

            default:
                System.out.println("nono");
                break;
        }

        /*
        if和switch应用
        如果判断的数值不多，而且符合byte,short,int,char四种，建议使用switch语句，因为效率稍高。
        对区间判断，对结果为boolean类型判断，使用if，if的范围更广。
         */


    }
}
