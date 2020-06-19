public class FunctionDemo {



    public static void main(String[] args) {

        //定义功能，完成一个整数*3+5的运算，并打印结果。
        /*
        修饰符 返回值类型 函数名(参数类型 形式参数1,参数类型 形式参数2,……){
            执行语句
            return 返回值;
        }
         */

        int x = getResult(6);
        System.out.println("6*3+5=" + x);

        int y = getResult(8);
        System.out.println("8*3+5=" + y);

        getResult1(8);
        getResult1(9);

    }

    public static int getResult(int num) {
        return num * 3 + 5;
    }

    //当函数运算后，没有具体的返回值时，这时候返回值类型用一个关键字标识。
    //该关键字就是void。void：代表的是该函数没有具体返回值时的情况。
    //当函数的返回值类型是void时，函数中的return语句省略不写。
    public static void getResult1(int num) {
        System.out.println(num * 3 + 5);
    }

}
