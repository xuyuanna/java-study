package Day15;

public class GenericDemo4 {
    public static void main(String[] args) {
//        Demo<String> demo = new Demo<String>();
//        demo.show("show! ");
//        demo.print("print! ");

//        Demo d = new Demo();
//        d.show("你好");
//        d.show(new Integer(9));
//        d.print("你好");
//        d.print(new Integer(4));

        Demo<String> demo = new Demo<>();
        demo.show("你好");

        demo.print("你好");
        demo.print(4);
        demo.print(new Person("", 1));

        Demo.method("hahahaha");
        Demo.method(9517);
    }
}

//泛型类定义的泛型，在整个类中有效，如果被方法使用
//那么泛型类的对象，明确要操作的具体类型后，所有要操作的类型就已经固定了
//为了让不同方法可以操作不同类型，而且类型还不确定，那么可以将泛型定义在方法上

/*
特殊之处：
静态方法不可以访问类上定义的泛型。
如果静态方法操作的引用数据类型不确定，可以将泛型定义在方法上
 */

/*
class Demo<T>{
    public void show(T t){
        System.out.println("show: "+ t);
    }
    public void print(T t){
        System.out.println("print: "+ t);
    }
}
*/

//既有泛型类，又有泛型方法
class Demo<T> {
    public void show(T t) {
        System.out.println("show: " + t);
    }

    public <B> void print(B b) {
        System.out.println("print: " + b);
    }

    public static <W> void method(W w) {
        System.out.println("method: " + w);
    }

}
