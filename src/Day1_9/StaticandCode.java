package Day1_9;

class Code {
    private int num = 9;

    //构造函数，给对应对象初始化
    public Code() {
        System.out.println("b");
    }

    //静态代码块。给类初始化，最先执行
    static {
        System.out.println("a");
    }

    //构造代码块，给对象初始化
    {
        System.out.println("c");
    }

    //构造函数，给对应对象初始化
    Code(int x) {
        System.out.println("d");
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public static void show() {
        System.out.println("show run");
    }

    public static void main(String[] args) {
        System.out.println(1111);
        Code.show();
    }
}

public class StaticandCode {
    public static void main(String[] args) {

        //acd
        Code code1 = new Code(4);
        Code code = new Code();
        int num = code.getNum();
        System.out.println("------");

        //acb
        //new Day1_9.Code();
    }
}

/*
1、因为new用到了Person.class，所以会先找到Person.class类文件并加载到内存中
2、执行该类中的static代码块，如果有的话，给Person.class类进行初始化
3、在堆内存中开辟空间，分配内存地址
4、在堆内存中建立对象的特有属性，并进行默认初始化
5、对属性进行显示初始化
6、对对象进行构造代码块初始化
7、对对象进行相应的构造函数初始化
8、将内存地址赋给栈内存中的p变量
 */
