package Day1_9;/*
    1、内部类定义在局部时，不可以被成员修饰符修饰
    2、可以直接访问外部类中的成员，因为还持有外部类中的引用。
        但是不可以访问所在的局部中的变量，只能访问被final修饰的局部变量
*/

class Out{
    int x = 6;

    void method(final int a){
         final int y = 8;

        //不能被static修饰
        class In{
            void function(){
                //System.out.println("x:"+Day1_9.Out.this.x);  //6
                //System.out.println("y:"+y);  //8
                System.out.println(a);
            }
        }

        new In().function();
    }
}

public class InnerClassDemo2 {
    public static void main(String[] args) {
        Out out = new Out();
        out.method(8);
        out.method(99);


    }
}
