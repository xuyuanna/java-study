/*
有一个圆形和长方形。
都可以获取面积，对于面积如果出现非法数值，视为是获取面积时出现的异常


总结！！！！！！！！：：：：：
异常：是对问题的描述，将问题进行对象的封装
异常体系：
Throwable
    |--Error
    |--Exception
        |--RuntimeException
异常体系的特点：异常体系中的所有类以及建立的对象都具有可抛性，
    也就是说可以被throw和throws关键字所操作
    只有异常体系具备这个特点

throw和throws的用法：
throw定义在函数内，用于抛出异常对象
throws定义在函数上，用于抛出异常类，可以抛出多个，用，隔开

当函数内有throw抛出异常对象，并未进行try catch处理，必须要在函数上声明，否则编译失败
注意：RuntimeException除外，如果函数抛出的是RuntimeException异常，函数上可以不用声明

如果函数声明了异常，调用者需要进行处理。处理方式可抛可try

异常有2种：
1、编译时被检测异常：：
该异常在编译时，如果没有处理（没有抛没有try），那么编译失败
该异常被标识，代表着可以被处理
2、运行时异常（编译时不检测）：：
在编译时不需要处理，编译器不检测，该异常发生时，建议不处理让程序停止，需要对代码进行修正


*/
package Day10_Exception;

interface Shape {
    void getArea();
}

//长方形
class Rectangle implements Shape {
    private int length, width;

    Rectangle(int length, int width) throws ValueException
    {
        if (length <= 0 || width <= 0) {
            throw new ValueException("长方形出现非法数值");
        }
        this.length = length;
        this.width = width;

    }

    @Override
    public void getArea() {
        System.out.println("Rectangle: " + (length * width));
    }
}

//圆形
class Circle implements Shape {
    private int radius;
    public static final double PI = 3.14;

    Circle(int radius) //throws ValueException
    {
        if (radius <= 0) {
            throw new ValueException("圆形出现非法数值");
        }
        this.radius = radius;
    }

    @Override
    public void getArea() {
        System.out.println("Circle: " + (PI * radius * radius));
    }
}

//异常。出现异常就停止运行。
class ValueException extends RuntimeException {
    ValueException(String message) {
        super(message);
    }
}


public class ExceptionTest {
    public static void main(String[] args) {
        System.out.println("开始计算长方形");

        Rectangle rectangle = new Rectangle(5, 4);
        rectangle.getArea();

        System.out.println("长方形计算结束");
        System.out.println();
        System.out.println("开始计算圆形");

        Circle circle = new Circle(-5);
        circle.getArea();

        System.out.println("圆形计算结束");

    }
}
