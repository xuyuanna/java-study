package Day1_9;/*
静态代码块
格式：
static{
    执行语句。
}

特点：随着类的加载而执行，只执行一次。并优先于主函数
用于给类进行初始化的。
 */

class StaticCode{
    static {
        System.out.println("静态代码块3");
    }
    public static void show(){
        System.out.println("show run");
    }
}

public class StaticCodeDemo {
    static {
        //System.out.println("静态代码块1");
    }

    public static void main(String[] args) {
        //Day1_9.StaticCode staticCode = new Day1_9.StaticCode();
        //Day1_9.StaticCode staticCode1 = new Day1_9.StaticCode();  //执行过一次，不执行了
        //System.out.println("over");
        //1 2 3 voer

        StaticCode.show();

    }

    static {
        //System.out.println("静态代码块2");
    }
}
