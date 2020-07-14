/*
文本文件读取方式二
通过字符数组进行读取
 */
package Day18;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo2 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("demo.txt");

        //定义一个字符数组，用于存储读到的字符
        //该read(char [])返回的是读到的字符个数
        char[] buf = new char[1024];

        int num = 0;
        while ((num = fileReader.read(buf)) != -1) {
            System.out.println(new String(buf, 0, num));
        }


        fileReader.close();

    }
}
