/*
1、获取任意年的二月由多少天
    根绝指定的年，设置一个时间

2、获取昨天的现在这个时刻
 */
package Day18;

import java.util.Calendar;

public class CalendarTest {
    public static void main(String[] args) {
        Test1();
        System.out.println("-------");
        Test2();
    }

    //获取任意年的二月由多少天
    public static void Test1() {
        Calendar calendar = Calendar.getInstance();

        //某一年的3月1号
        calendar.set(2012, 2, 1);
        calendar.add(Calendar.DAY_OF_MONTH, -1);

        int date = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(date);

        int month = calendar.get(Calendar.MONTH);
        System.out.println(month);
    }

    //获取昨天的现在这个时刻
    public static void Test2() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, -1);

        int year = calendar.get(Calendar.YEAR);
        int month = (calendar.get(Calendar.MONTH)) + 1;
        int date = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = (calendar.get(Calendar.HOUR)) + 12;
        int min = calendar.get(Calendar.MINUTE);

        String time = year + "年 " + month + "月" + date + "日 " + hour + "时" + min + "分";
        System.out.println(time);
    }
}
