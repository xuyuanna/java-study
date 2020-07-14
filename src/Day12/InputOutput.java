/*
线程间通信
就是多个线程在操作同一个资源，但是操作的动作不同

wait()
notify();
notifyAll();
都使用在同步中，因为要对持有监视器（锁）的线程操作

定义在Object：
因为这些方法在操作同步中线程时，都必须要标识他们所操作线程持有的锁
只有同一个锁上的被等待线程 可以被 同一个锁上的线程notify()唤醒。不可以对不同锁中的线程进行唤醒

也就是说，等待和唤醒是同一个锁
而锁可以是任意对象，所以可以被任意对象调用的方法定义在Object中
*/

package Day12;


class Resource {
    String name;
    String sex;
    boolean flag = false;

    public synchronized void set(String name, String sex) {
        if (flag) {
            try {
                this.wait();
            } catch (Exception e) {
            }
        }

        //if flag = false
        this.name = name;
        this.sex = sex;
        flag = true;
        this.notify();
    }

    public synchronized void out() {
        if (!flag) {
            try {
                this.wait();
            } catch (Exception e) {
            }
        }

        //if flag = true
        System.out.println(name + "....." + sex);
        flag = false;
        this.notify();
    }
}

class Input implements Runnable {
    private Resource resource;

    Input(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        int x = 0;
        while (true) {
            if (x == 0) {
                resource.set("mike", "man");
            } else {
                resource.set("丽萨", "女");
            }
            x = (x + 1) % 2;
        }
    }

}

class Output implements Runnable {
    private Resource resource;

    Output(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        while (true) {
            resource.out();
        }
    }

}

public class InputOutput {

    public static void main(String[] args) {
        Resource resource = new Resource();

        Input input = new Input(resource);
        Output output = new Output(resource);

        Thread thread1 = new Thread(input);
        Thread thread2 = new Thread(output);

        thread1.start();
        thread2.start();
    }

}

