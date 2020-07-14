package Day1_9;

class Car1{
    //描述颜色
    String color = "blue";
    //描述轮胎数
    int num = 6;

    //运行行为
    void run(){
        System.out.println(color + ".."+num);
    }

}

public class CarDemo1 {
    public static void main(String[] args){
        //匿名对象

        //调用匿名对象的属性没有意义
        new Car1().num = 5;
        new Car1().color = "red";
        new Car1().run();    //blue..6-->new一次创建一次对象


        Car c = new Car();
        c.run();
        c.setNum(4);
        new Car().run();
        //匿名对象使用方法：当对对象的方法只调用一次的时候，可以用匿名对象来完成，比较简化
        //如果对对象进行多个成员调用，必须给这个对象起名字。
    }
}
