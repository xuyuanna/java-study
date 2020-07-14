package ExceptionDemo;/*
老师用电脑上课。

出现问题：蓝屏，冒烟
要对问题进行描述，封装成对象

出现冒烟，讲课无法继续


 */


class BlueScreenException extends Exception {
    BlueScreenException(String message) {
        super(message);
    }
}

class MaoYanException extends Exception {
    MaoYanException(String message) {
        super(message);
    }
}

class NoPlanException extends Exception {
    NoPlanException(String message) {
        super(message);
    }
}


class Computer1 {
    private int state = 3;

    public void run() throws BlueScreenException, MaoYanException {
        if (state == 2) {
            throw new BlueScreenException("蓝屏了");
        }

        if (state == 3) {
            throw new MaoYanException("冒烟了");
        }

        System.out.println("电脑运行");
    }

    public void reset() {
        state = 1;
        System.out.println("电脑重启");
    }
}

class Teacher1 {
    private String name;
    private Computer1 computer;

    Teacher1(String name) {
        this.name = name;
        computer = new Computer1();
    }

    public void teach() throws NoPlanException {
        System.out.println(name + "老师开始讲课了");


        try {
            computer.run();

        } catch (BlueScreenException e) {

            System.out.println(e.getMessage());
            computer.reset();

        } catch (MaoYanException e) {
            test();
            throw new NoPlanException("课时无法继续," + e.getMessage());

        }

    }

    public void test() {
        System.out.println("布置作业");
    }


}

public class ExceptionTest {
    public static void main(String[] args) {
        Teacher1 teacher = new Teacher1("张三");
        try {
            teacher.teach();
        } catch (NoPlanException e) {
            System.out.println(e.toString());
            System.out.println("换电脑");
        }


    }
}
