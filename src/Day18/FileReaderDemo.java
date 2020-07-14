/*
文本文件读取方式一
读取单个字符
 */
package Day18;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        //创建一个文件读取流对象，和指定名称的文件相关联，
        //要保证该文件是已经存在的，如果不存在会发生 FileNotFoundException
        FileReader fileReader = new FileReader("demo.txt");

        //调用读取流对象的read方法
        //read() 一次读一个字符，会自动往下读

        int ch = 0;
        while ((ch = fileReader.read()) != -1) {
            System.out.println("ch = " + (char) (ch));
        }

        fileReader.close();
    }
}
