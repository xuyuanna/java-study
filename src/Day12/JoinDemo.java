/*
当a线程执行到了b线程的join()方法时，a就会等待b线程都 执行完，a才会在执行
join可以用来临时加入线程执行
 */

package Day12;

public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        JoinTest jointest = new JoinTest();

        Thread thread1 = new Thread(jointest);
        Thread thread2 = new Thread(jointest);

        thread1.start();

        thread1.setPriority(Thread.MAX_PRIORITY);   //10

        thread2.start();


       // thread1.join();



    }
}

class JoinTest implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 70; i++) {
            System.out.println(Thread.currentThread().toString() + "…………" + i);
            Thread.yield();
        }
    }
}
