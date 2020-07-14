/*
将字节流转成字符流，再使用字符流缓冲区的readLine方法
1、需求：想把键盘录入的数据存储到一个文件中
    源：键盘录入
    目的：文件

2、需求：将一个文件的数据打印在控制台上
    源：文件
    目的：控制台

流操作的基本规律：
1、明确源和目的
    源：输入流。  InputStream    Reader
    目的：输出流。OutputStream   Writer
2、操作的数据是否是纯文本
    是：字符流
    不是：字节流
3、当体系明确后，再明确要使用哪个具体的对象
    通过设备来区分：
    源设备：内存、硬盘、键盘
   目的设备：内存、硬盘、控制台

1、一个文本文件的数据存储到另一个文件中。复制文件
源：
    InputStream     Reader
是操作文本文件：
    就选择 Reader
设备：
    硬盘上的文件
    Reader体系中可以操作文件的对象是 FileReader
需要提高效率：
    加入Reader体系中缓冲区 BufferedReader

    FileReader fileReader = new FileReader("a.txt");
    BufferedReader bufferedReader = new BufferedReader(fileReader);

目的：
    OutputStream    Writer
是纯文本：
    选择Writer
设备：
    硬盘上的文件
    Writer体系中可以操作文件的对象是 FileWriter
需要提高效率：
    加入Reader体系中缓冲区 BufferedWriter

    FileWriter fileWriter = new FileWriter("b.txt");
    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);


 */
package Day19;

import java.io.*;

public class TransStreamDemo2 {
    public static void main(String[] args) throws IOException {
        //改变源
//        System.setIn(new FileInputStream("PersonDemo.java"));
        //改变目的
//        System.setOut(new PrintStream("zz.txt"));

        //键盘录入的最常见写法 需求2
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("out.txt")));

        //需求3
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("demo.txt")));
//        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            if ("over".equals(line)) {
                break;
            } else {
                bufferedWriter.write(line.toUpperCase());
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        }
        bufferedReader.close();
    }
}

