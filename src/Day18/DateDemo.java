package Day18;

import java.text.SimpleDateFormat;
import java.util.Date;


public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        //将模式封装到 SimpleDateFormat 对象中
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");

        //调用format方法让模式格式化指定Date对象
        String time = simpleDateFormat.format(date);

        System.out.println("time = " + time);


        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy年");
        String year = simpleDateFormat1.format(date1);
        System.out.println("year : " + year);
    }
}
