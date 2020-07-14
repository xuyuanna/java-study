package exception;

public class Main {

    public static void main(String[] args) {

        Processor processor;

        System.out.println("程序开始了");

        System.out.println("乘法运算。。。。");
        processor = new MultipleProcessor();
        try {
            System.out.println(processor.process(1, 2));
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("除法运算。。。。");
        processor = new DivProcessor();
        try {
            System.out.println(processor.process(1, 0));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("main 收到了异常，但是处理了");
        }

        System.out.println("加法运算。。。。");
        processor = new AddProcessor();
        try {
            System.out.println(processor.process(1, 2));
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("程序结束了");

        //throw new RuntimeException();
    }

}
