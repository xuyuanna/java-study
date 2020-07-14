package Day1_9;/*
匿名内部类：
1、匿名内部类就是内部类的简写格式
2、定义匿名内部类的前提：
内部类必须继承一个类或者实现一个接口。\
3、格式：
    ner 父类(){
    定义子类的内容
    }.方法();
4、其实匿名内部类就是一个匿名子类对象，可以理解为带内容的对象
5、匿名内部类中定义的方法最好不要超过3个。1、2
 */

abstract class Wai2 {
    abstract void show();
}

class Wai {
    int x = 3;

    /*
    class Nei extends Day1_9.Wai2 {
        void method() {
            System.out.println("method: " + x);
        }

        @Override
        void show() {
            System.out.println("Day1_9.Wai2 show: " + x);
        }
    }*/

    //匿名内部类


    public void function() {
        /*
        Nei nei = new Nei();
        nei.method();
        nei.show();
        */

        //匿名内部类.没有名字用父类代替
        new Wai2(){
            @Override
            void show(){
                System.out.println("x = "+x);
            }
            void abc(){
                System.out.println("abc");
            }

            //不能同时调用，要new一个新的Wai2
        }.show();



    }
}


public class InnerClassDemo3 {
    public static void main(String[] args) {
        new Wai().function();
    }
}
