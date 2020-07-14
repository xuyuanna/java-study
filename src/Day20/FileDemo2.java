/*
String      list()   列出当前目录下所有文件名，包含隐藏
listRoots()   列出可用的文件系统根
listFiles()  返回对象
 */

package Day20;

import java.io.File;
import java.io.FilenameFilter;

public class FileDemo2 {
    public static void main(String[] args) {
        listRootsDemo();
        System.out.println("------------------------------");

        listDemo();
        System.out.println("------------------------------");

        listDemo2();
        System.out.println("------------------------------");

        listFileDemo();
    }

    public static void listFileDemo() {
        File dir = new File("c:\\");
        File[] files = dir.listFiles();
        for (File file : files) {
            System.out.println("listFile: " +file.getName()+" : "+file.length());

        }
    }

    public static void listDemo2() {
        File dir = new File("c:\\");
        String[] arr = dir.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
//                if (name.endsWith(".log")) {
//                    return true;
//                } else {
//                    return false;
//                }
                return name.endsWith("log");
            }
        });
        System.out.println("len: " + arr.length);

        for (String name : arr) {
            System.out.println(name);
        }
    }

    //列出当前目录下所有文件，包含隐藏
    //调用了list方法的file对象必须是封装了一个目录。该目录必须存在。
    public static void listDemo() {
        File file = new File("c:\\");
        String[] names = file.list();
        for (String name : names) {
            System.out.println("c:\\   " + name);
        }

    }

    //列出可用的文件系统根
    public static void listRootsDemo() {
        File[] files = File.listRoots();
        for (File file : files) {
            System.out.println(file);
        }
    }
}
