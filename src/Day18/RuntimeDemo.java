/*
Runtime对象
该类并没有提供构造函数，说明不可以new对象，该类中的方法都是静态的
该类中还有非静态方法，说明该类会提供方法获取本类对象
而且该方法是静态的，并且返回值类型是本类类型

由这个特点可以看出该类使用了单例设计模式

该方式是 static Runtime getRuntime()
 */

package Day18;


import java.util.Date;

public class RuntimeDemo {
    public static void main(String[] args) throws Exception {
        Runtime runtime = Runtime.getRuntime();
        Process p = runtime.exec("C:\\Program Files (x86)\\Tencent\\QQ\\Bin\\QQScLauncher.exe");


//        Thread.sleep(2000);
//        //杀掉子进程
//        p.destroy();



    }
}
