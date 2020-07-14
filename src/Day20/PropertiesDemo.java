/*
Properties 是 Hashtable 的子类
它具备了map集合的特点，而且存储的键值对都是字符串

Properties是集合中和IO技术相结合的集合容器
可以用于键值对形式的配置文件

在加载数据时，需要数据有固定格式，键=值
 */
package Day20;

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        setAndGet();
        System.out.println("--------------------------");
        method_1();
        System.out.println("--------------------------");
        loadDemo();
    }

    public static void loadDemo() throws IOException {
        Properties prop = new Properties();

        FileInputStream fileInputStream = new FileInputStream("c:\\新建文件夹\\info.txt");

        prop.load(fileInputStream);

        prop.setProperty("lisi", 40 + "");

        FileOutputStream fileOutputStream = new FileOutputStream("c:\\新建文件夹\\info.txt");

        prop.store(fileOutputStream, "hah");

        prop.list(System.out);

        fileOutputStream.close();
        fileInputStream.close();

    }

    //演示，如何将流中的数据存储到集合中
    //将info.txt中的键值数据存到集合中进行操作
    /*
    1、用一个流和info.txt文件关联
    2、读取一行数据，将该行数据用”=“进行切割
    3、等号左边作为键，右边作为值，存入到Properties
    */
    public static void method_1() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("c:\\新建文件夹\\info.txt"));
        String line = null;
        Properties prop = new Properties();

        while ((line = bufferedReader.readLine()) != null) {
            String[] arr = line.split("=");
            prop.setProperty(arr[0], arr[1]);
        }
        bufferedReader.close();
        System.out.println(prop);
    }

    //设置和获取元素
    public static void setAndGet() {
        Properties prop = new Properties();
        prop.setProperty("zhangsan", "30");
        prop.setProperty("lisi", "45");
        prop.setProperty("wangwu", "28");
//        System.out.println(prop);

        String value = prop.getProperty("lisi");
        System.out.println(value);

        prop.setProperty("lisi", 89 + "");

        Set<String> set = prop.stringPropertyNames();
        System.out.println(set);
        for (String s : set) {
            System.out.println(s + " : " + prop.getProperty(s));
        }
    }
}
