package Day12;

public class ThreadTest {
    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + i);
                }
            }
        }.start();

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }

        Runnable runnable =  new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + i);
                }
            }
        };

        new Thread(runnable).start();


        new ThreadTest1().start();
    }
}


//class麻烦
class ThreadTest1 extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "你好 ");
        }
    }
}
