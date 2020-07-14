/*
String类适用于描述字符串事物，那么它就提供了多个方法对字符串进行操作
特性、操作方法

操作方法：
1、获取
    1.1 字符串中的包含的字符数，也就是字符串的长度
        int      length()：获取长度
    1.2 根据位置获取位置上的某个字符。
        char     charAt(int index)
    1.3 根据字符获取该字符在字符串中的位置
        int     indexOf(int ch): 返回ch在字符串中第一次出现的位置
        int     indexOf(int ch, int fromIndex): 从指定的fromIndex位置开始索引，获取ch在字符串中出现的位置

        int     indexOf(String str): 返回str字符串在字符串中第一次出现的位置
        int     indexOf(String str, int fromIndex): 从指定的fromIndex位置开始索引，获取str字符串在字符串中出现的位置

2、判断
    2.1 字符串中是否包含某一个子串
        boolean     contains(str)
        indexOf(str):可以索引str第一次出现的位置，如果返回-1，表示该str不在字符串中存在
                    所以，也可以用于对指定判断是否包含
                    该方法既可以判断，也可以获取出现的位置
    2.2 字符串中是否为空
        boolean     isEmpty() : 原理就是判断长度是否为0
    2.3 字符串是否是以指定内容开头
        boolean     statsWith(str)
    2.4 字符串是否是以指定内容结尾
        boolean     endWith(str)
    2.5 判断字符串的内容是否相同
        boolean     equals(str)
    2.6 判断内容是否相同，并忽略大小写
        boolean     equalsIgnoreCase();

3、转换
    3.1 将字符数组转换成字符串
        构造函数：String(char[])
                 String(char[], offset, count)：将字符数组中的一部分转成字符串
        静态方法：
                 static String copyValueOf(char[]);
                 copyValueOf(char[] data, int offset, int count)

                 static String ValueOf(char[])
    3.2 将字符串转换成字符数组**
        char[]      toCharArray()

    3.3 将字节数组转换成字符串
        String(byte[])
        String(byte[], offset, count)：将字节数组中的一部分转成字符串

    3.4 将字符串转换成字节数组
        byte[]      getBytes()：

    3.5 将基本数据类型转换成字符串
        static String ValueOf(int)   //3+""-->static String ValueOf(3)
        static String ValueOf(int)

    字符串和字节数组在转换过程中是可以指定编码表的

    3.6 将字符串按照

4、替换**
    如果要替换的字符不存在，那么返回的还是原字符串
    String      replace(oldChar, newChar)

5、切割
    String[]         split(regex)

6、子串。获取字符串中的一部分
    如果角标不存在，会出现字符串角标越界异常
    String      subString(begin)    begin到结尾
    String      subString(begin, end) 不包括end

7、转换，去除空格，比较
    7.1 将字符串转换成大写或者小写
        String      toUpperCase()
        String      toLowerCase()
    7.2 将字符串两端的多个空格去除
        String      trim()
    7.3 对两个字符串进行自然顺序的比较
        字典顺序 小于，返回比0小的数。相等，返回0。大于，返回比0打的数
        int         compareTo(String)


 */

package Day13;


public class StringDemo {
    public static void method_7(){
        String s = "    Hello  Java    ";
        sop("小写："+s.toLowerCase());
        sop("大写："+s.toUpperCase());
        sop("两端空格去除："+s.trim());

        String s1 = "acc";
        String s2 = "aaa";
        sop("自然顺序比较："+s1.compareTo(s2));
    }

    public static void method_sub(){
        String s = "abcdefg";

        //从2到结尾
        sop(s.substring(2));

        //包含2 到 不包含4
        sop(s.substring(2,4));

        sop(s.substring(0,s.length()));
    }

    public static void method_split() {
        String s = "zhangsan,lisi,wangwu";
        String[] arr = s.split(",");
        for (int i = 0; i < arr.length; i++) {
            sop(arr[i]);
        }
    }

    public static void method_replace() {
        String s = "hello java";
        String s1 = s.replace('a', 'n');
        sop("s= " + s);
        sop("replace:  s1 = " + s1);

        String s2 = s.replace("java", "world");
        sop("s2= " + s2);
    }

    public static void method_trans() {
        char[] arr = {'a', 'b', 'c', 'd', 'e', 'f'};
        String str = new String(arr, 1, 4);

        sop("str = " + str);

        String str1 = "zdfegwas";
        char[] chs = str1.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            sop("chs：" + chs[i]);
        }
    }

    public static void method_is() {
        String str = "ArrayDemo.java";

        //判断文件名称是否是以Array单词开头
        sop("开头：" + str.startsWith("Array"));

        //判断文件名是否是以.Java单词结尾
        sop("结尾：" + str.endsWith(".java"));

        //判断文件名是否包含Demo
        sop("包含：" + str.contains("Demo"));
    }

    public static void method_get() {
        String str = "bcadefath";

        //长度
        sop("长度: " + str.length());

        //根据位置获取索引
        sop("根据位置获取索引: " + str.charAt(5));

        //根据索引获取位置
        sop("根据索引获取位置: " + str.indexOf("a"));
        sop("根据索引获取位置: " + str.indexOf("ca"));
        sop("根据索引获取位置: " + str.indexOf("l"));
        sop("根据索引获取位置: " + str.lastIndexOf("a"));


        sop("指定索引开始，获取位置: " + str.indexOf("a", 3));
        sop("指定索引开始，获取位置: " + str.indexOf("th", 3));
    }

    public static void main(String[] args) {
        method_7();
        System.out.println("----------");

        method_sub();
        sop("-------------");

        method_split();
        sop("-------------");

        method_replace();
        sop("-------------");


        method_trans();
        sop("-------------");

        method_get();
        sop("-------------");

        method_is();
        System.out.println("-------");

        //s1是一个类类型变量，“abc"是一个对象
        //字符串最大的特点：一旦被初始化j就不可以改变
        String s1 = "abc";
        //"abc"对象没变，s1指向变了
        //s1="abcc";
        System.out.println(s1);

        String s2 = new String("abc");
        System.out.println("s1和s2：" + (s1 == s2));

        //String类复写了Object类中equals方法，该方法用于判断字符串是否相同
        System.out.println("s1.equals(s2):" + (s1.equals(s2)));

        //s1和s2有什么区别？
        //s1在内存中有一个对象
        //s2在内存中有两个对象

        System.out.println("-------------");

        String s3 = "def";
        String s4 = new String("def");
        String s5 = "def";

        System.out.println("s3和s4：" + (s3 == s4));
        System.out.println("s3和s5：" + (s3 == s5));

        System.out.println("------------------");
    }

    public static void sop(Object object) {
        System.out.println(object);
    }
}
