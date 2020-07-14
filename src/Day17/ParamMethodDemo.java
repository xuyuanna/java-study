/*
jdk1.5版本出现的新特性

方法的可变参数在使用时，可变参数一定要定义在参数列表的最后面
 */
package Day17;

public class ParamMethodDemo {
    public static void main(String[] args) {

        //可变参数
        show(2,3,4,5);
        show();
        show2("你好",1,2,3,7);

    }

    public static void show(int...arr) {
        System.out.println(arr.length);
    }

    public static void show2(String str,int...arr){
        System.out.println(arr.length);
    }

}
