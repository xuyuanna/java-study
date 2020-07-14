package exception;

public class AddProcessor implements Processor {
    @Override
    public int process(int a, int b) {
//        throw new Exception("我就是要抛异常");
        return a + b;
    }
}
