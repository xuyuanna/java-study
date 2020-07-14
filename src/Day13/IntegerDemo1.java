/*
jdk1.5以后出现的新特性

 */
package Day13;

import sun.awt.geom.AreaOp;

public class IntegerDemo1 {
    public static void main(String[] args) {
//        Integer x = new Integer(4);

//        自动装箱
        Integer x = 4;

        //x自动装箱，变成了int类型，和2进行加法运算，再将和进行自动装箱 赋值给x
        x = x /* x.intValue()*/ + 2;

        Integer m = 128;
        Integer n = 128;
        System.out.println(m==n);   //false
        System.out.println("m == n:"+ (m.equals(n)));

        Integer a = 126;
        Integer b = 126;

        //结果为true，因为a和b指向了同一个Integer对象
        //因为当数值在byte -128~+127 范围内容，对于新特性，如果该数值已经存在，则不会在开辟新的空间
        System.out.println(a==b);

        System.out.println("m == n:"+ (a.equals(b)));
    }

    public static void method() {
        Integer x = new Integer("123");
        Integer y = new Integer(123);

        System.out.println("equals : " + (x.equals(y)));
    }
}
