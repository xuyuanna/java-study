/*
需求：一个简单的卖票程序。多个窗口同时卖票

 创建线程的第一种方式：
 1、定义类，继承 Thread
2、复写Thread类中的run方法
3、调用线程的start方法（启动线程。调用run方法）

 创建线程的第二种方式：
 1、定义类，实现 Runnable 接口
 2、覆盖Runnable 中的run方法
    将线程要运行的代码储存在run方法中
 3、通过Thread类建立线程对象
 4、将Runnable接口的子类对象作为实际参数传递给Thread类的构造函数
    为什么？：因为自定义的run方法所属的对象是Runnable接口的子类对象，所以要让线程去执行指定对象的run方法
 5、调用Thread类的start方法，开启线程，并调用Runnable接口子类的run方法

 实现方式和继承方式的区别：：：
 实现方式：好处在于 避免了单继承的局限性
 在定义线程时，建议使用实现方式

 继承方式：线程代码存放在Thread子类run方法中
 实现方式：贤臣代码存在放接口的子类的run方法中

 打印出了0，-1，-2等错票，多线程的运行出现了安全性问题
 是因为 当多条语句在操作同一个线程共享数据时，一个线程对多条语句只执行了一部分，还没有执行完，
 另一个线程就参与进来执行，导致了共享数据的错误

解决办法：对多条操作共享数据的语句，只能让一个线程都执行完，在执行过程中，其他线程不可以参与执行
Java对于多线程的安全问题提供的解决方式就是： 同步代码块
 synchronized(对象){
    需要被同步的代码
 }
对象如同锁，持有锁的线程可以在同步中执行
没有持有锁的线程即使获取了cpu的执行权也进不去，因为没有锁

同步的前提：
1、必须要有2个或者以上的线程
2、必须是多个线程使用同一个锁
必须保证同步中只能有一个线程在运行

弊端：多个线程都需要判断锁，较为消耗资源
 */

package Day11_thread;


class Ticky implements Runnable {
    private int tick = 400;
    Object obj = new Object();

    @Override
    public void run() {
        while (true) {

            synchronized (obj) {

                if (tick > 0) {

                    try {
                        Thread.sleep(5);
                    } catch (Exception e) {

                    }
                    System.out.println(Thread.currentThread().getName() + " sale: " + tick--);

                }

            }

        }
    }

}

public class ThreadDemo2 {
    public static void main(String[] args) {
        Ticky ticky = new Ticky();
        //创建了一个线程
        Thread thread1 = new Thread(ticky);
        Thread thread2 = new Thread(ticky);
        Thread thread3 = new Thread(ticky);
        Thread thread4 = new Thread(ticky);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }
}
