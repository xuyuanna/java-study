/*
基本数据类型对象包装类
基本数据类型  引用数据类型 类
byte            Byte
short           short
int             Integer
long            Long
boolean         Boolean
float           Float
double          Double
char            Character

基本数据类型对象包装类的最常见作用，就是用于  基本数据类型和字符串类型之间做转换

1、基本数据类型转成字符串：
    基本数据类型+""
    基本数据类型.toString(基本数据类型值)
    Integer.toString(34)：  将整数34变成"34"

2、字符串转成基本数据类型：
    基本数据类型包装类.parseInt(String str)

十进制转成其他进制
    toBinaryString();
    toHexString();
    toOctalString()
其他进制转成十进制
    parseInt(数,数的进制)

parseInt 静态调用方式

非静态  对象调用方式
Integer i = new Integer("123")
int num = i.intValue()
 */

package Day13;

public class IntegerDemo {
    public static void main(String[] args) {
        //整数类型的最大值
        sop("int max: " + Integer.MAX_VALUE);

        sop(Integer.toString(34) + 5);


        //将字符串转换成整数
        int num = Integer.parseInt("123");
        sop(num + 4);

        sop(Long.parseLong("51196"));
        sop(Boolean.parseBoolean("true"));
        System.out.println();
        sop(Boolean.parseBoolean(""));

        System.out.println("--------");

        sop(Integer.toBinaryString(3));
        sop(Integer.toHexString(60));

        //把2进制 110 转成十进制
        int x = Integer.parseInt("110", 2);
        int y = Integer.parseInt("3c",16);
        sop("x=" + x);
        sop("y="+y);

        System.out.println("=====================================");

        


    }


    public static void sop(Object object) {
        System.out.println(object);
    }
}
