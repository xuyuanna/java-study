package Day1_9;/*模板方法设计模式：

需求：获取一段程序运行的时间
原理：获取程序开始和结束的时间并相减
System.currentTimeMillis()  返回以毫秒为单位的当前时间

当代码完成优化后，就可以解决这类问题了。
这种方式叫做  模板方法设计模式
：在定义功能时，功能的一部分是确定的，但是有一部分是不确定的，而确定的部分在使用不确定的部分，
那么这时就将不确定的部分暴露出去，由该类的子类去完成
 */

abstract class GetTime {

    //不能复写
    public final void getTime() {
        long start = System.currentTimeMillis();

        runcode();

        long end = System.currentTimeMillis();

        System.out.println();
        System.out.println("毫秒：" + (end - start));
    }

    //抽象
    public abstract void runcode();
}

class SubTime extends GetTime {
    public void runcode() {
        for (int i = 0; i < 1500; i++) {
            System.out.print(i);
        }
    }
}

public class TemplateDemo {
    public static void main(String[] args) {
        //Day1_9.GetTime gt = new Day1_9.GetTime();
        SubTime subtime = new SubTime();
        subtime.getTime();
    }
}
