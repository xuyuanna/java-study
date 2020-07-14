/*
同步函数
需求：银行有一个金库。有两个储户，分别存300元，每次存100，存3次

该程序是否有安全问题，如果有，如何解决？
1、明确哪些代码是多线程运行代码
2、明确共享数据
3、明确多线程运行代码中哪些语句是操作共享数据的
 */
package Day11_thread;


class Bank {
    private int sum;
    Object obj = new Object();

    public synchronized void add(int n) {
        //synchronized (obj) {
        sum += n;
        try {
            Thread.sleep(10);
        } catch (Exception e) {

        }
        System.out.println("sum = " + sum);
        //}
    }
}

class Customer implements Runnable {
    private Bank bank = new Bank();

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            bank.add(100);
        }
    }
}

public class SynchronizedBankDemo {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Thread thread1 = new Thread(customer);
        Thread thread2 = new Thread(customer);
        thread1.start();
        thread2.start();
    }
}
