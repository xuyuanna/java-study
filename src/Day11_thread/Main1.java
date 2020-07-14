package Day11_thread;

/**
 * #1, 进程跟线程，线程是计算机执行的最小单元。一个进程有一组线程在为他工作。
 * #2，我开了QQ跟微信，QQ需要8条线程为我工作，微信需要8条线程为我工作，但是我的电脑是4核8线程的，那处理器怎么工作？
 * 其实CPU8个线程一直在工作，在不同线程之间切换，但是人眼感受不到。
 */
public class Main1 {

    /**
     * 创建多线程的第一种方式： 实例化Runnable，然后把runnable交给Thread运行
     *
     * @param args
     */
    public static void main(String[] args) {

        // #1 第一步，实例化Runnable对象
        // 定义了线程要处理的事情
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                }
            }
        };

        // #2， 将Runnable交给Thread对象
        // 定义一个线程，线程的运行是交给Thread类，具体运行的内容事情就是由Runnable决定
        Thread thread = new Thread(runnable, "Thread");
        Thread thread2 = new Thread(runnable, "Thread2");
        Thread thread3 = new Thread(runnable, "Thread3");
        Thread thread4 = new Thread(runnable, "Thread4");

        // #3， 调用Thread的start()方法启动线程
        thread.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }

}