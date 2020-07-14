/*
System：类中的方法和属性都是静态的

out：代表标准输出，默认是控制台
int：标准输入，默认是键盘

描述系统的一些信息

获取系统属性信息：Properties   getProperties()
 */

package Day18;

import java.util.Properties;

public class System18 {
    public static void main(String[] args) {
        Properties prop = System.getProperties();

        //Properties是Hashtable的子类，也就是Map集合的一个子类对象
        //可以通过map的方法取出该集合中的元素
        //该集合中存储的都是字符串，没有泛型定义

        //在系统中自定义一些特有信息
        System.setProperty("mykey", "myvalue");


        //获取所有属性信息
        for (Object obj : prop.keySet()) {
            Object value = (Object) prop.get(obj);
            System.out.println(obj + " : " + value);
        }

        System.out.println();

        //获取指定属性信息
        String value = System.getProperty("os.name");
        System.out.println("value = " + value);

        //
        String v = System.getProperty("hah");
        System.out.println("v = " + v);
    }
}
