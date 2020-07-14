package Day10_Exception;

class Super{
        int i = 0;
        public Super(){}
        public Super(String s){
            i = 1;
        }
}

public class Test2 extends Super {
    public Test2 (String s){
        //super();
        i=2;
    }



    public static void main(String[] args) {
        Test2 test2 = new Test2("yes");
        System.out.println(test2.i);
    }
}
