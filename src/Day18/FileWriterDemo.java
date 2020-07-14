/*
字节流和字符流：

1、字节流的两个抽象基类
InputStream, OutputStream

2、字符流的两个抽象基类
Reader, Writer

IO流是用于操作数据的，数据的最常见体现形式是：文件

需求：在键盘上，创建一个文件并写入一些文字

专门用于操作文件的 Writer子类对象→FileWriter
 */
package Day18;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        //创建一个FileWriter对象，该对象一被初始化，就必须要明确被操作的文件
        //该文件会被创建到指定的目录下,如果已有同名文件，将会覆盖
        FileWriter fileWriter = new FileWriter("demo.txt");

        //调用write方法，将字符串写入到流中。
        fileWriter.write("Hello java!");
        fileWriter.write("Hello java!");


        //刷新该流的缓冲，将数据刷到目的地中
//        fileWriter.flush();

        //关闭流资源，但是关闭之前会刷新缓冲
        fileWriter.close();
    }
}


