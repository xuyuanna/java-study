/*
死锁
同步中嵌套同步，而锁却不同
 */
package Day11_thread;


class LockTest implements Runnable{
    private boolean flag;

    LockTest(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run(){
        if(flag){
            synchronized (MyLock.locka){
                System.out.println("if locka");
                synchronized (MyLock.lockb){
                    System.out.println("if lockb");
                }
            }
        }else{
            synchronized (MyLock.lockb){
                System.out.println("else lockb");
                synchronized (MyLock.locka){
                    System.out.println("else locka");
                }
            }
        }
    }
}

class MyLock{
    static Object locka =new Object();
    static Object lockb =new Object();

}

public class DeadLockTest {
    public static void main(String[] args) {


        Thread thread1 = new Thread(new LockTest(true));
        Thread thread2 = new Thread(new LockTest(false));

        thread1.start();

        thread2.start();
    }
}
