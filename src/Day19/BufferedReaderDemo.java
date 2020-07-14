/*
字符读取流缓冲区
提供了一个 一次读一行的方法readLine,方便与对文本数据的获取
当返回空时，表示读到文档末尾

readLine方法只返回回车符之前的数据内容，并不返回回车符
 */
package Day19;

import java.io.*;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        //创建一个读取流对象和文件相关联
        FileReader fileReader = new FileReader("buf.txt");

        //加入缓冲技术,将流对象传入
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = null;
        while ((line = bufferedReader.readLine())!=null){
            System.out.println(line);
        }

//        String s = bufferedReader.readLine();
//        System.out.println("s = " + s);
//
//        String s1 = bufferedReader.readLine();
//        System.out.println("s1 = " + s1);

        bufferedReader.close();
    }
}
