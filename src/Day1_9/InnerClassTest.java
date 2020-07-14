package Day1_9;

interface Interaface{
    void method();
}

class Test{
    //补足代码。通过匿名内部类

    /*
    static class Intera implements Day1_9.Interaface{
        @Override
        public void method(){
         System.out.println("implements");
        }
    }

    static Intera  function(){
        return new Intera();
    }
    */

    static Interaface function(){
         return new Interaface(){
             @Override
             public void method() {
                 System.out.println("我是匿名 method");
             }
        };
    }
}

class AA implements Interaface{
    @Override
    public void method(){};
}

public class InnerClassTest {
    public static void main(String[] args) {

        //Day1_9.Test.function(): Test类中有一个function的static方法
        //.method()这个方法运算后的结果是一个对象，而且是一个Interaface类型的对象，
        //因为只有是Interaface类型的对象， 才可以调用method()方法
        Test.function().method();

        show(new Interaface() {
            @Override
            public void method() {
                System.out.println("method show run");
            }
        });
    }

    public static void show(Interaface interaface){
        interaface.method();
    }
}

class InnerClassTest2{
    public static void main(String[] args) {
        new Object(){
            public void method(){
                System.out.println("-----------------");
            }
        }.method();
    }
}


