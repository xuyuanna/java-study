package car;//需求：汽车配车厂，对汽车进行改造，将 来的车 都改成黑色，三个轮胎。
/*class Car2{
    String color = "red";
    int num = 8;

    void run(){
        System.out.println("num="+num+",color="+color);
    }
}*/

/**
 * 方法栈中的数据被修改，只在当前栈中有效
 * 堆内存中的数据被修改，对这个对象的引用全部会生效
 */
public class CarDemo2 {
    public static void main(String[] args) {

        // 对象
        Car q = new Car();
        Car c = q;
        // 修改c的地址成一个新的Car
        c = new Car();
        // 修改q的堆内存数据
        show(q);
        // 打印q
        q.run();
        System.out.println("====================");
        // 打印c
        c.run();
        // 去其他方法里面，把c的地址改成其他地址，是不会修改到这里c的地址，因为c的地址记录在当前栈中，只能在当前栈修改
        change(c);
        c.run();

        // 原始数据类型，int long boolean char short
        int i = 1;
        change(i);
        System.out.println(i);
    }

    public static void show(Car c) {
        c.num = 5;
        c.color = "blue";
    }

    public static void change(int i) {
        i = 2;
    }

    public static void change(Car c) {
        c = new Car();
        c.color = "111111";
        c.num = 11111;
        c.run();
    }
}
