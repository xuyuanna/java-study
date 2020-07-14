/*

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

练习：将键盘录入的数据，按照指定的编码表（UTF-8），保存到一个文件中

 */
package Day19;


import java.io.*;

public class InputFileTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("test.txt"),"UTF-8"));

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
