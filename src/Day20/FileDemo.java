/*
File类的常见方法
1、创建
    boolean     createNewFile(); 在指定位置创建文件，如果该文件已经存在，就不创建返回false
                            和输出流不一样，输出流对象一建立就会创建文件，如果文件已经存在，会覆盖
    boolean     mkdir();    创建文件夹
    boolean     mkdirs();   创建多级文件夹

2、删除
    boolean     delete();   删除成功，返回true。删除失败，返回false
    void        deleteOnExit(); 在程序退出时，删除指定文件

3、判断
    boolean     canExecute();   文件是否可以执行
    boolean     exists();   文件是否存在
    boolean     isDirectory();
    boolean     isFile;
    boolean     isHidden();
    boolean     isAbsolute(); 绝对

4、获取信息
    getName();
    getPath();  获取路径  可存在，可不存在
    getParent();    获取父目录。该方法返回的是绝对路径中的父目录。
                    如果获取的是相对路径，返回null
                    如果相对路径中有上一层目录，那么该目录就是返回结果

    getAbsolutePath();  获取绝对路径 可存在，可不存在
    lang    lastModified()  最后一次修改时间
    lang    lenth()
 */

package Day20;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {

        System.out.println("------------consMethod-------------");
        consMethod();

        System.out.println("---------------method_1--------------");
        method_1();

        System.out.println("---------------method_2----------------");
        method_2();

        System.out.println("---------------method_3----------------");
        method_3();

        System.out.println("---------------method_4----------------");
        method_4();

        System.out.println("---------------method_5----------------");
        method_5();


    }

    //创建File对象
    public static void consMethod() {
        //将FileTest.txt封装成File对象，可以将已有的和未出现的文件或文件夹封装成对象
        File file = new File("FileTest.txt");

        File file1 = new File("C:\\Users\\xuyuanna\\FileTest.txt");


        File file2 = new File("C:\\Users\\xuyuanna", "FileTest.txt");

        File d = new File("C:\\Users\\xuyuanna");
        File file3 = new File(d, "FileTest.txt");

        System.out.println("file : " + file);
        System.out.println("file1 : " + file1);
        System.out.println("file2 : " + file2);
        System.out.println("file3 : " + file3);

        //目录分隔符
        File file4 = new File("C:" + File.separator + "Users\\xuyuanna\\FileTest.txt");

    }

    //删除
    public static void method_1() throws IOException {
        File file1 = new File("file.txt");
        file1.deleteOnExit();
        System.out.println("create: " + file1.createNewFile());

        System.out.println("delete: " + file1.delete());
    }

    //判断
    public static void method_2() {
        File file = new File("file2.txt");
        System.out.println("execute: " + file.canExecute());

        System.out.println("exists: " + file.exists());
        System.out.println("exists: " + new File("out.txt").exists());

        //创建文件夹
        File dir = new File("abc");
        System.out.println(dir.mkdir());

        File dir2 = new File("abc\\kk");
        System.out.println(dir2.mkdir());

        File dir3 = new File("abc\\kk\\ccc\\sfe\\es\\cdc\\dfefa");
        System.out.println(dir3.mkdirs());
    }


    public static void method_3() throws IOException {
        File file = new File("isfile.txt");
        file.createNewFile();
        System.out.println("exists: " + file.exists());
        //在判断是否是文件或者目录之前，必须先判断该文件或者目录是否存在，exists()
        System.out.println("isDirectory: " + file.isDirectory());
        System.out.println("isFile: " + file.isFile());


        File file1 = new File("C:\\Users\\xuyuanna\\FileTest.txt");
        System.out.println("isAbsolute: " + file1.isAbsolute());

    }

    //获取
    public static void method_4() {
        File file = new File("get.txt");
        System.out.println("Path: "+file.getPath());
        System.out.println("AbsolutePath: "+file.getAbsolutePath());
        System.out.println("Parent: "+file.getParent());
        System.out.println("length: "+file.length());

        System.out.println("----");

        File file1 = new File("xuyuanna\\FileTest.txt");
        System.out.println("Path: "+file1.getPath());
        System.out.println("AbsolutePath: "+file1.getAbsolutePath());
        System.out.println("Parent: "+file1.getParent());
        System.out.println("length: "+file1.length());
    }

    public static void method_5() {
        File file1 = new File("rename.txt");
        File file2 = new File("rename1.txt");
        System.out.println("rename: " + file1.renameTo(file2));

    }

    }
