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

练习：将一个图片文件数据存储到另一个文件中。复制图片文件。
   */

package Day19;

import java.io.*;

public class CopyPictureTest {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;


        try {
            bufferedReader = new BufferedReader(new FileReader("C:\\Users\\xuyuanna\\Desktop\\1.jpg"));
            bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\xuyuanna\\Desktop\\3.jpg"));
            byte[] buf = new byte[1024];

            int len = 0;
            while ((len = bufferedReader.read()) != -1) {
                bufferedWriter.write(len);
            }
        }catch (IOException e){
            throw new RuntimeException("?");
        }finally {
            try {
                if(bufferedWriter!=null){
                    bufferedWriter.close();
                }
            }catch (IOException e){
                throw new RuntimeException("失败！");
            }
            try {
                if (bufferedReader!=null){
                    bufferedReader.close();
                }
            }catch (IOException e){
                throw new RuntimeException("失败！");
            }
        }

    }





}
