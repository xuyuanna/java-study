/*
出现多个生产者和消费者
要用 while判断标记
让被唤醒的线程再一次判断标记


notifyAll()
要唤醒对方线程
只用notify()，容易出现只唤醒本方线程的情况，导致程序中的所有线程都在 等待
 */

package Day12;

public class ProducerDemo {
    public static void main(String[] args) {
        Resc resc = new Resc();
        Producer producer = new Producer(resc);
        Consumer consumer = new Consumer(resc);

        Thread thread1 = new Thread(producer);
        Thread thread2 = new Thread(producer);

        Thread thread3 = new Thread(consumer);
        Thread thread4 = new Thread(consumer);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}

class Resc {
    private String name;
    private int count = 1;
    private boolean flag = false;

    public synchronized void set(String name) {

        while (flag) {
            try {
                this.wait();
            } catch (Exception e) {
            }
        }

        //if flag = false
        this.name = name + "--" + count++;
        System.out.println(Thread.currentThread().getName() + "...生产者..." + this.name);
        flag = true;
        this.notifyAll();
    }

    public synchronized void out() {
        while (!flag) {
            try {
                this.wait();
            } catch (Exception e) {
            }
        }

        //flag = true
        System.out.println(Thread.currentThread().getName() + "......消费者......" + this.name);
        flag = false;
        this.notifyAll();

    }
}

class Producer implements Runnable {
    private Resc resc;

    Producer(Resc resc) {
        this.resc = resc;
    }

    @Override
    public void run() {
        while (true) {
            resc.set("+++商品+++");
        }
    }
}

class Consumer implements Runnable {
    private Resc resc;

    Consumer(Resc resc) {
        this.resc = resc;
    }

    @Override
    public void run() {
        while (true) {
            resc.out();
        }
    }
}