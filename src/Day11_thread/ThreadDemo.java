/*
进程是一个正在执行中的程序
每一个进程执行都有一个执行的顺序，该顺序就是一个执行路径，或者叫控制单元
一个进程至少有一个线程

线程就是进程中的一个独立的控制单元，线程在控制着进程的执行

jvm启动的时候，会有一个进程 java.exe
该进程中至少有一个线程在负责Java程序的执行
而且这个线程运行的代码存在于main方法中
该线程称之为主线程

扩展： jvm启动不止一个线程，还有负责垃圾回收机制的线程

通过对api的查找，java已经提供了对线程这类事物的描述。就是Thread
创建线程的第一种方式：继承Thread类

运行结果每次都不同   多线程的一个特性：随机性。谁抢到谁就执行，至于执行多长时间，是cpu说了算
多个线程都在获取cpu的执行权，cpu执行到谁谁就运行，在某一时刻只能有一个程序在运行.(多核除外)
cpu在做着快速的切换，看上去是同时运行的效果

为什么要覆盖run方法：：：
Thread类用于描述线程
该类就定义了一个功能，用于存储线程要运行的代码，该存储功能就是run方法
也就是说Thread类中的run方法是用于存储线程要运行的代码


*/


package Day11_thread;

class Demo extends Thread {

    @Override
    public void run(){

        for (int i = 0; i < 200; i++) {
            System.out.println("demo run----" + i);
        }

    }
}

public class ThreadDemo {
    public static void main(String[] args) {

        //创建好一个线程
        Demo d = new Demo();

        //开启线程，并执行线程的run方法
        d.start();

        System.out.println("-------------------");

        //仅仅是对象调用方法，而并没有运行创建的线程
        //d.run();

        for (int i = 0; i < 200; i++) {
            System.out.println("Day1_9.Hello Java!----" + i);
        }

    }
}
