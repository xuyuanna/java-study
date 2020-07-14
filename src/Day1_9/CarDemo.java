package Day1_9;

class Car{
    //描述颜色
    private String color = "red";
    //描述轮胎数
    private int num = 4;

    //运行行为
    void run(){
        System.out.println(color + ".."+num);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}

public class CarDemo {
    public static void main(String[] args){
        //通过new操作符来完成
        Car c = new Car();  //Car是一个类。c是一个类类型的变量。类类型的变量指向对象。

        //将车的颜色改成绿色
        c.setColor("green");
        String color = c.getColor();

        c.run();

        Car c1 = new Car();
        c1.run();

        System.out.println(c1.getNum());
    }
}
