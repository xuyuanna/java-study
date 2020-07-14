/*
RandomAccessFile:
    该类不算是IO体系中的子类，而是直接继承自Object
    但是是IO包中的成员，具备了读和写功能

    内部封装了一个数组，而且通过指针对数组中的元素进行操作
    可以通过getFilePointer 获取指针位置
    同时可以通过 seek 改变指针的位置

    其实完成读写的原理就是内部封装了字节输入流和输出流

    局限性：该类只能操作文件。
    而且操作文件还有模式：
    只读 r
    读写 rw
    如果模式为r，不会创建文件，会读取，如果不存在，会出现异常
    如果模式为rw，要操作的文件不存在，会自动创建，如果存在，不会覆盖，直接添加
 */
package Day21;

import java.io.*;


public class RandomAccessFileDemo {
    public static void main(String[] args) throws IOException {
        writeFile();
        readFile();
//        writeFile2();
    }

    public static void readFile() throws IOException {
        RandomAccessFile raf = new RandomAccessFile("ran.txt", "r");

        //调整对象指针
        raf.seek(8);

        //跳过指定的字节数
//        raf.skipBytes(8);

        byte[] buf = new byte[8];

        raf.read(buf);
        String name = new String(buf);
        int age = raf.readInt();


        System.out.println("name=" + name);
        System.out.println("age=" + age);
        raf.close();
    }


    public static void writeFile() throws IOException {
        RandomAccessFile raf = new RandomAccessFile("ran.txt", "rw");

        raf.write("李四".getBytes());
        raf.writeInt(97);

        raf.write("王五".getBytes());
        raf.writeInt(99);

        raf.close();
    }

    public static void writeFile2() throws IOException {
        RandomAccessFile raf = new RandomAccessFile("ran.txt", "rw");
        raf.seek(8 * 0);
        raf.write("周期".getBytes());
        raf.writeInt(103);
        raf.close();
    }
}
