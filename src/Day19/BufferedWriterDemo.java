/*
缓冲区的出现视为了提高流的操作效率
所有在创建缓冲区之前，必须先有流对象

缓冲区 换行符
.newLine();
 */

package Day19;

import java.io.*;

public class BufferedWriterDemo {


    public static void main(String[] args) throws IOException {
        //创建一个字符写入流对象
        FileWriter fileWriter = new FileWriter("buf.txt");

        //为了提高字符写入流的效率，加入缓冲技术,将流对象传入
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (int x = 1; x < 5; x++) {
            bufferedWriter.write("abcd"+x);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }

        //用到缓冲区，就要刷新
        bufferedWriter.flush();

        //其实关闭缓冲区，就是在关闭缓冲区中的流对象
        fileWriter.close();
        bufferedWriter.close();
    }


}
