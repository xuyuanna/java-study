package ExceptionDemo;

class Math2 {
    int div(int a, int b) throws ArithmeticException, ArrayIndexOutOfBoundsException
    //在功能上通过throws的关键字，声明了该功能有可能出现问题，抛几个就应该有几个catch
    {
        int[] arr = new int[a];
        System.out.println(arr[2]);
        return a / b;
    }
}


public class ExceptionDemo2 {
    public static void main(String[] args) //throws Exception
    {
        Math2 math2 = new Math2();

        try {
            int x = math2.div(5, 222222222);
            System.out.println("x = " + x);
        }catch (ArithmeticException e) {
            System.out.println(e.toString());
            System.out.println("除0啦！");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
            System.out.println("角标越界啦！");
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        System.out.println("over");

    }
}
