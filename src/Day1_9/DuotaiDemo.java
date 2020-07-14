package Day1_9;/*
多态：事物存在的多种体现形态

    1、多态的基本体现
    父类的引用指向了自己的子类对象。父类的引用也可以接收自己的子类对象。
    Day1_9.Animal cat = new Day1_9.Cat();

    2、多态的前提
    必须是类与类之间有关系，继承或者实现
    通常还有一个前提，就是存在覆盖。

    3、多态的优点弊端
    优点：多态的出现大大提高了程序的扩展性。
    弊端：调提高了扩展性，但是只能引用访问父类中的成员。


    4、多态的应用
    5、多态的出现代码中的特点（多态使用的注意事项）
 */


/*
需求：动物
猫，狗
 */

abstract class Animal{
    public abstract void eat();
}

class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("吃鱼");
    }

    public void catchMouse(){
        System.out.println("抓老鼠");
    }
}

class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("吃肉");
        }

    public void door(){
        System.out.println("看家");
    }
}

class Pig extends Animal{
    @Override
    public void eat(){
        System.out.println("饲料");
    }

    public void gongdi(){
        System.out.println("拱地");
    }
}

public class DuotaiDemo {
    public static void main(String[] args) {
        /*
        Day1_9.Cat cat = new Day1_9.Cat();
        function(cat);

        function(new Day1_9.Dog());
        */




        //Day1_9.Animal pig = new Day1_9.Pig(); //类型提升。向上转型
        //pig.eat();

        //如何调用Pig特有的方法。向下转型
        //强制将父类的引用转成子类类型。不能将父类对象转换成子类类型。
        //多态自始至终都是子类对象在做变化。

        //Day1_9.Pig pig2 = (Day1_9.Pig) pig;
        //pig2.gongdi();

        function(new Cat());
        function(new Dog());
        function(new Pig());

    }

    public static void function(Animal animal){
        animal.eat();
        if(animal instanceof Cat){
            Cat cat2 = (Cat)animal;
            cat2.catchMouse();
        }else if(animal instanceof Dog){
            Dog dog2 = (Dog) animal;
            dog2.door();
        }else{
            Pig pig2 = (Pig) animal;
            pig2.gongdi();
        }
    }
}


    /*
    public static void function(Day1_9.Cat cat) {
        cat.eat();
    }

    public static void function(Day1_9.Dog dog){
        dog.eat();
    }
    */

