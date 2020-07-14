package Day11_thread;
/*
创建两个线程，和主线程交替运行
原来线程都有自己默认的名称Thread-编号【从0开始

Thread.currentThread(): 获取当前线程对象
getName(): 获取线程名称
设置线程名称：setName或者构造函数
*/

class Test extends Thread {


    Test(String name){
        super(name);
    }

    @Override
    public void run(){
        for (int i = 0; i < 60; i++) {
            System.out.println(" test run " + i + " " +Thread.currentThread().getName());
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        Test test1 = new Test("one");
        Test test2 = new Test("two");
        test1.start();
        test2.start();

        for (int i = 0; i < 60; i++) {
            System.out.println("main....." + i);
        }

    }
}
