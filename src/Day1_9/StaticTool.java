package Day1_9;/*
静态的应用
每一个应用程序中都有共性的功能，可以将这些功能进行抽取，独立封装，以便复用

虽然可以通过建立Tool的对象使用这些工具方法，对数组进行操作
但是：
1、对象是用于封装数据的，可是Tool对象并没有封装特有数据
2、操作数组的每一个方法都没有用到Tool对象中的特有数据

这时，让程序更严谨是不需要对象的，可以将Tool中的方法都定义成静态的，用类名调用即可

将方法都静态后可以方便于使用，但是该类还是可以被其他程序建立对象的。
为了更为严谨，强制让该类不能建立对象
可以通过将构造函数私有化完成
 */

class Tool {

    private Tool() {
    }

    public static int getMax(int[] arr) {
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return arr[max];
    }

    public static int getMin(int[] arr) {
        int min = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[min] > arr[i]) {
                min = i;
            }
        }
        return arr[min];
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

/*
一个类中默认会有一个空参数的构造函数，
这个默认的构造函数的权限和所属类一致
如果类被public修饰，那么默认的构造函数也带public修饰符。
如果类没有被public修饰，那么默认的构造函数也没有public修饰。

默认构造函数的权限是随着类的变化而变化的。
 */