package Day11_thread;

/**
 * #1, 进程跟线程，线程是计算机执行的最小单元。一个进程有一组线程在为他工作。
 * #2，我开了QQ跟微信，QQ需要8条线程为我工作，微信需要8条线程为我工作，但是我的电脑是4核8线程的，那处理器怎么工作？
 * 其实CPU8个线程一直在工作，在不同线程之间切换，但是人眼感受不到。
 */
public class Main2 {

    // 直接重写Thread对象，重写里面的run()方法，然后启动线程
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread("MyThread1");
        myThread1.start();
    }

}


// 重写Thread类里面的run方法，等下这个对象的start方法就是运行这里面的run方法
class MyThread extends Thread {

    MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ": My Thread : " + i);
        }
    }
}
