package Day1_9;

/*
单例设计模式第二种写法

对象是方法调用时，才初始化，也叫做对象的延时加载。称为：懒汉式。（建议使用饿汉式）
Single类进内存，对象还没有存在，只有调用了get方法时，对象才会被建立。
 */
class Single1 {
    private static Single1 single = null;

    private Single1() {
    }

    ;

    public static Single1 getSingle() {
        if (single == null) {
            synchronized (Single1.class) {
                if (single == null) {
                    single = new Single1();
                }
            }
        }
        return single;
    }
}

public class SingleDemo2 {
    public static void main(String[] args) {
        Single1 single = Single1.getSingle();
        Single1 single1 = Single1.getSingle();
        System.out.println(single);
        System.out.println(single1);

        System.out.println(single == single1);
    }
}
