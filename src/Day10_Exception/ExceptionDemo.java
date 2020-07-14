/*
异常在子父类覆盖中的体现：
1、子类在覆盖父类时，如果父类的方法抛出异常，那么子类的覆盖方法，只能抛出父类的异常或者该异常的子类。
2、如果父类方法抛出多个异常，那么子类在覆盖该方法时，只能抛出父类异常的子集
3、如果父类或者接口的方法中没有异常抛出，那么子类在覆盖方法时，也不可以抛出异常
如果子类方法发生了异常，就必须要进行try处理，绝对不能抛。
---------------------------------------------
自定义异常：定义类继承Exception或者RuntimeException
按照java的面向对象思想。将程序中出现的特有问题进行封装。
1、为了让该自定义类具备可抛性
2、为了让该类具备操作异常的共性方法

当要定义自定义异常的信息时，可以使用父类已经定义好的功能。
将异常信息传递给父类的构造函数
class MyException extends Exception/RuntimeException{
    MyException(String message){
        super(message);
    }
}
 ---------------------------------------------
 异常的好处：
 1、将问题进行封装成对象
 2、将 正常流程代码 和 问题处理代码 相互分离，方便阅读

 异常的处理原则：
 1、处理方式有两种：try 或者throws
 2、调用到抛出异常的功能时，抛出几个就要catch处理几个
    一个try对应多个catch
 3、多个catch时，父类catch要放到后面
 4、catch内需要定义针对性的处理方式，不要简单的定义 printStackTraceh或者输出语句，也不要不写
    当捕获到的异常，本功能处理不了时，可以继续在catch中抛出，
    try{
        throw new AException();
    }catch(AException e){
        throw e;
    }

如果该异常处理不了，但并不属于该功能出现的异常，可以将异常转换后，再抛出和该功能相关的异常
或者异常可以处理，当需要将异常产生的和本功能相关的问题提供出去。
当调用者知道，并处理。也可以捕获异常处理后，转换新的异常抛出
try{
    throw new AException();
}catch(AException e){
    //对A异常进行处理。
    throw BException();
}

异常的注意事项：

在子父类覆盖时：
1、子类抛出的异常必须是父类的异常本身或者子类
2、如果父类或者接口没有异常抛出时，子类覆盖出现异常，只能try不能抛


 */

package Day10_Exception;

class AException extends Exception{

}

class BException extends AException{

}

class CException extends Exception{

}

class Fu{
    void show()throws AException{

    }
}

class Zi extends Fu{
    @Override
    void show()throws BException{   //BException或者AException

    }
}

class Test {
    void function(Fu fu) throws AException {
        fu.show();
    }
}

public class ExceptionDemo {
    public static void main(String[] args) {

    }
}
