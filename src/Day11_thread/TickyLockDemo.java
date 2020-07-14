/*
同步函数用的是哪一个锁？：
函数需要被对象调用，那么函数都有一个所属对象的引用，就是this
所以同步函数使用的锁是this

通过该程序来验证：
使用两个线程来卖票
一个线程在同步代码块中，一个在同步函数中

同步函数被static修饰后，使用的锁是：该方法所在类的字节码文件对象-->类名.class
不是this，因为静态方法中不可以定义this
静态金内存时，内存中没有本类对象，但是一定有该类对应的字节码文件对象   类名.class
该对象的类型是Class


 */

package Day11_thread;


class TickyLock implements Runnable {
    private static int ticky = 200;
//    private  int ticky = 200;


    Boolean flag = true;

    @Override
    public void run() {
        if (flag) {

                for (int i = ticky; i > 0; i--) {
                    synchronized (TickyLock.class) {
                        System.out.println("当前的票还剩下：" + ticky--);
                    }
                }
        } else {
            while (true) {
                sale();
            }
        }
    }

    //    public synchronized void sale() {
    public static synchronized void sale() {
        if (ticky > 0) {
            try {
                Thread.sleep(10);
            } catch (Exception e) {
            }
            System.out.println(Thread.currentThread().getName() + " 同步函数 " + ticky--);
        }
    }
}

public class TickyLockDemo {
    public static void main(String[] args) {

        TickyLock tickylock = new TickyLock();

        Thread thread1 = new Thread(tickylock);
        Thread thread2 = new Thread(tickylock);

        thread1.start();

        try {
            Thread.sleep(10);
        } catch (Exception e) {
        }

        tickylock.flag = false;

        thread2.start();

    }
}
