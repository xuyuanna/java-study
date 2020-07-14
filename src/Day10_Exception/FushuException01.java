/*
finally代码块：定义一定执行的代码
通常用于关闭资源
catch是用于处理异常，。如果没有catch，就代表异常没有被处理过，如果该异常是检测时异常，那么必须声明。

三种格式：
1、try{需要被检测的代码}
catch(){处理异常的代码}

2、try{}
catch(){}
finally{一定会被执行的代码}

3、try{}
finally{}

finally定义的通常是 关闭资源代码，因为资源必须释放；
finally只有一种情况下不会被执行， 当执行到System.exit(0)，finally不会执行
*/
package Day10_Exception;

class FushuException extends Exception{
    FushuException(String msg){
        super(msg);
    }
}

class Demo{
    int div(int a,int b) throws FushuException{
        if (b<0){
            throw new FushuException("除数小于0!");
        }
        return a/b;
    }
}

public class FushuException01 {
    public static void main(String[] args) {
        System.out.println("start!");
        Demo demo = new Demo();
        try{
            int x = demo.div(4,-33);
            System.out.println("x = " + x);
        }catch (FushuException e){
            System.out.println(e.toString());
            //return; //函数终止，会运行finally
            System.exit(0); //系统退出，finally不会被执行
        }finally {
            //finall中存放的是一定会被执行的代码
            System.out.println("Finally!");
        }
        System.out.println("over!");
    }
}
