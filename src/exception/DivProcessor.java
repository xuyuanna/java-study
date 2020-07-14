package exception;

public class DivProcessor implements Processor {

    @Override
    public int process(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("除数不能是0");
            System.out.println("div processor发生了异常，但是我不想处理，抛出去，给调用者自己处理");
            throw e;
        }
    }

}
