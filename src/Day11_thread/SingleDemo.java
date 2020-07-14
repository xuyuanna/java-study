/*
单例设计模式 懒汉式
特点：延迟加载
如果多线程访问时，会出现延迟问题
加同步synchronized，双重判断
锁：该类所属的字节码文件对象
 */

package Day11_thread;

class Single {
    private static Single single = null;

    private Single() {
    }

    ;

    public static Single getInstance() {
        if (single == null) {
            synchronized (Single.class) {
                if (single == null) {
                    single = new Single();
                }
            }
        }
        return single;

    }


}
public  class SingleDemo {
    public static void main(String[] args) {
        Single single = Single.getInstance();
        System.out.println(single);

        Single single1 = Single.getInstance();
        System.out.println(single1);

        System.out.println(single == single1);

    }
}

