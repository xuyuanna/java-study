package Day1_9;/*
this语句不能用在一般函数中,只能用于构造函数之间进行互相调用
只能定义在构造函数的第一行,因为初始化要先执行.
 */

class Candy {
    private String name;
    private int price;

    Candy(){
        //this("hah");   死循环
    }

    Candy(String name) {
        this();
        this.name = name;
    }

    Candy(String name, int price) {
        //this.name = name;  跟上面重复动作

        //this语句.只能放在构造函数的第一行
        this(name);
        this.price = price;
    }

    void print(){
        System.out.println(name+":"+price);
    }
}


public class ThisDemo2 {
    public static void main(String[] args) {
        Candy candy1 = new Candy("pear",88);
        candy1.print();

    }
}
