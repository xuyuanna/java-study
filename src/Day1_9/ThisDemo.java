package Day1_9;/*
需求:给玩具定义一个用于比较价格是否相同的功能.也就是是否是同价格.
 */

/*
    this代表它所在函数所属对象的引用.就是哪个对象在调用this所在的函数,this就代表哪个对象.
    应用:当定义类中的功能时,该函数内部要用到调用函数的对象时,该对象用this来表示
    但凡类中功能内部使用到了本类的对象,都用this表示
     */

class Toy {
    private int price;

    Toy(int price) {
        this.price = price;
    }

    public boolean isSame(Toy toy) {
        /*if (this.price == toy.price){
            return true;
        }
        return false;*/

        return this.price == toy.price;
    }
}

public class ThisDemo {
    public static void main(String[] args) {
        Toy toy1 = new Toy(88);
        Toy toy2 = new Toy(24);

        System.out.println(toy1.isSame(toy2));
    }
}
