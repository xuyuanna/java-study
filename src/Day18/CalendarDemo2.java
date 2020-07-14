package Day18;

import java.util.Calendar;

public class CalendarDemo2 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
//        calendar.set(2012,3,4);

        calendar.add(Calendar.YEAR,4);
        calendar.add(Calendar.MONTH,6);
        calendar.add(Calendar.DAY_OF_MONTH,-14);



        printCalendar(calendar);
    }

    public static void printCalendar(Calendar calendar){
        String[] mons = {"一月", "二月", "三月", "四月",
                "五月", "六月", "七月", "八月",
                "九月", "十月", "十一月", "十二月"};
        int index_mons = calendar.get(Calendar.MONTH);

        String[] weeks = {"", "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        int index_weeks = calendar.get(Calendar.DAY_OF_WEEK);

        int year = calendar.get(Calendar.YEAR);
//        int month = (calendar.get(Calendar.MONTH)) + 1;
        int date = calendar.get(Calendar.DAY_OF_MONTH);


        System.out.println(year + "年 " + mons[index_mons] + date + "日 " + weeks[index_weeks]);
    }
}
