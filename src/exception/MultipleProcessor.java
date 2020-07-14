package exception;

public class MultipleProcessor implements Processor {

    @Override
    public int process(int a, int b) {
        return a * b;
    }
}
