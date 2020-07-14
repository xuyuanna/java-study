/*
将同步synchronized替换成现实的Lock操作
将Object中的wait，notify，notifyAll替换成了Condition对象
该对象可以通过Lock锁进行获取

该实例中，实现了本方只唤醒对方操作
 */

package Day12;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerDemo2 {
    public static void main(String[] args) {
        Resource2 resource2 = new Resource2();
        Producer2 producer2 = new Producer2(resource2);
        Consumer2 consumer2 = new Consumer2(resource2);

        Thread thread1 = new Thread(producer2);
        Thread thread2 = new Thread(producer2);

        Thread thread3 = new Thread(consumer2);
        Thread thread4 = new Thread(consumer2);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}

class Resource2 {
    private String name;
    private int count = 1;
    private boolean flag = false;
    private Lock lock = new ReentrantLock();
    private Condition condition_pro = lock.newCondition();
    private Condition condition_con = lock.newCondition();


    public void set(String name) throws InterruptedException {
        lock.lock();

        try {
            while (flag) {
                condition_pro.await();
            }

            //if flag = false
            this.name = name + "--" + count++;
            System.out.println(Thread.currentThread().getName() + "...生产者..." + this.name);
            flag = true;
            condition_con.signal();
        } finally {
            lock.unlock();
        }
    }

    public void out() throws InterruptedException {
        lock.lock();
        try {
            while (!flag) {
                condition_con.await();
            }

            //flag = true
            System.out.println(Thread.currentThread().getName() + "......消费者......" + this.name);
            flag = false;
            condition_pro.signal();
        } finally {
            lock.unlock();
        }
    }

}

class Producer2 implements Runnable {
    private Resource2 resource2;

    Producer2(Resource2 resource2) {
        this.resource2 = resource2;
    }

    @Override
    public void run() {
        while (true) {
            try {
                resource2.set("+++商品+++");
            } catch (InterruptedException e) {
            }
        }
    }
}

class Consumer2 implements Runnable {
    private Resource2 resource2;

    Consumer2(Resource2 resource2) {
        this.resource2 = resource2;
    }

    @Override
    public void run() {
        while (true) {
            try {
                resource2.out();
            } catch (InterruptedException e) {

            }
        }
    }
}
