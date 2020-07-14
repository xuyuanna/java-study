package Day11_thread;

/**
 * 卖票系统
 */
public class TicketDemo {

    public static int ticketCount = 100;

    public static void main(String[] args) {
        Sales sales1 = new Sales("销售员1");
        Sales sales2 = new Sales("销售员2");
        Sales sales3 = new Sales("销售员3");
        Sales sales4 = new Sales("销售员4");
        sales1.start();
        sales2.start();
        sales3.start();
        sales4.start();
    }

}

class Sales extends Thread {

    Sales(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            Object o = new Object();
            synchronized (this) {
                // 问泽华剩下多少票？ 1，然后我们两个一起卖
                if (TicketDemo.ticketCount > 0) {
                    System.out.println(Thread.currentThread().getName() + "卖出一张票了，现在余票还有：" + --TicketDemo.ticketCount);
                }
                if (TicketDemo.ticketCount <= 0) {
                    break;
                }
            }
        }
    }

}

