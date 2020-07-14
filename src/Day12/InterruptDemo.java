/*
如何停止线程？
run方法结束
开启多线程运行，运行代码通常都是循环结构
只要控制住循环，就可以让run方法结束，也就是线程结束

特殊情况：
当线程处于了冻结状态
就不会读取到标记，那么线程就不会结束

interrupt()：清除线程的冻结状态

 当没有指定的方式让冻结的线程恢复到运行状态时，就需要对冻结进行清洁，强制让线程恢复到运行状态，这样子就可以操作 标记，让线程结束
 */
package Day12;


public class InterruptDemo {
    public static void main(String[] args) throws InterruptedException {
        StopThread stopthread = new StopThread();

        Thread thread1 = new Thread(stopthread);
        Thread thread2 = new Thread(stopthread);

        thread1.setDaemon(true);

        thread1.start();
        thread2.start();

        //主线程
        int number = 0;

        while (true){
            if(number ++ == 60){
                //stopthread.changeFlag();
                thread1.interrupt();
                thread2.interrupt();

                break;
            }
            System.out.println(Thread.currentThread().getName() + " " + number);
        }
        System.out.println("over!!");


    }
}

class StopThread implements Runnable{
    private boolean flag = true;
    @Override
    public synchronized void run(){
        while (flag){
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + ".....Exception");
                flag = false;
            }
            System.out.println(Thread.currentThread().getName()+ ".....run");
        }
    }

    public void changeFlag(){
        flag = false;
    }
}
