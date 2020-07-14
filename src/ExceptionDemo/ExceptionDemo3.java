package ExceptionDemo;/*
    因为项目中会出现特有的问题，而这些问题并未被java所描述并封装对象
    所以对于这些特有的问题可以按照java对问题封装的思想，将特有的问题进行自定义的异常封装

    自定义异常:必须继承Exception

    需求：在本程序中对于除数是负数也视为错误的，是无法进行运算的，那么就需要对这个问题进行自定义的描述

   当在函数内部出现了throw抛出异常对象，那么必须要给出对应的处理动作
   1、在内部try catch处理，-->程序继续运行
   要么在函数上声明throw ，让调用者处理-->程序停止

   一般情况下，函数内出现异常，函数上需要声明

   自定义的异常没有定义所属信息：
   子类在构造时，将异常信息传递给父类，通过super()
   就可以获取自定义的异常信息

   throw和throws的区别：
   1、throws使用在函数上，throw使用在函数内
   2、throws后面跟的是异常类，可以跟多个人，用，隔开。throw豆面跟的是异常对象

注意： Exception 中有一个特殊的子类异常 RunTimeException， 运行时异常。
如果在函数内抛出该异常，函数上可以不用声明，编译一样通过
如果在函数上声明了该异常，调用者可以不用进行处理，编译一样通过

自定义异常时，如果该异常的发生无法在继续进行运算的话，就让自定义的异常继承RunTimeException

对于异常分两种：
1、编译时被检测的异常
2、编译时不被检测的异常（运行时异常）RunTimeException以及其子类
*/

class FushuException extends Exception {
    FushuException() {

    }

    FushuException(String message) {
        super(message);
    }

}


class Chufa {
    int div(int a, int b) throws FushuException {
        if(b <= 0){
            throw new FushuException("除数小于等于0啦！"+ b);
        }
        return a / b;
    }
}

public class ExceptionDemo3 {
    public static void main(String[] args) {
        Chufa chufa = new Chufa();

        try {
            int x = chufa.div(51, -55);
            System.out.println("x= " + x);
            } catch (FushuException e) {
            System.out.println(e.toString());
            System.out.println("除数错误啦了" + "," + e.getMessage());
        }


        System.out.println("over");
    }
}
