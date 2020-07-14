package ExceptionDemo;/*
异常：就是程序在运行时，出现不正常情况
异常由来：问题也是现实生活中一个具体事物，也可以通过java的类的形式进行描述并封装成对象
        其实java对不正常情况进行描述后的对象体现。
对于问题的划分：
1、严重问题 2、非严重问题
对于严重的，java通过Error类进行描述
    对于 Error 一般不编写针对性代码进行处理
对于非严重的，java通过 Exception 类进行描述
    对于Exception可以使用针对性的处理方式进行处理

无论Error和Exception都具有一些共性内容。
比如：不正常情况的信息，引发原因等

Throwable
    |Error
    |Exception

2、异常的处理
Java 提供特有的语句进行处理
try{
    需要被检测的代码：
}

catch(异常类 变量){
    处理异常的代码：（处理方式）
}

finally{
    一定会执行的语句;
}

3、对捕获到的异常对象进行常见方法操作
    1、String getMessage()  ：获取异常的信息
    2、.toString()   ：返回异常信息的描述

对多异常的处理
1、声明异常时，建议声明更为具体的异常，这样处理的可以更具体
2、声明有几个异常，就对应有几个catch块，不要定义多余的 catch块
   如果有多个catch块中的异常出现继承关系，父类异常catch要放在最下面

   建议在进行catch处理时，catch中一定要定义具体处理方式
   不要简单定义一句， e.printStackTrace()
   也不要简单的就书写一条输出语句
 */


class Math {
    int div(int a, int b)
    {
        return a / b;
    }
}


public class ExceptionDemo {
    public static void main(String[] args) {
        Math math = new Math();
        try{
            int x = math.div(88, 0);
            System.out.println("x = " + x);

        }catch(Exception e){
            System.out.println("除零了");
            System.out.println(e.getMessage()); //异常信息
            System.out.println(e.toString());   //异常名称：异常信息

            e.printStackTrace();    //异常名称 异常信息 异常出现的位置
                                    //jvm默认的异常处理机制就是在调用printStackTrace方法，打印异常在堆栈中的跟踪信息
        }

        System.out.println("over");
        System.out.println("-----------");

    }
}
