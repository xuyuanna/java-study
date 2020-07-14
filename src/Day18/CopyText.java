/*
将C盘一个文本文件复制到D盘

复制的原理：
将 C 盘下的文件数据存储到 D 盘的文件中

1、在D盘创建一个文件，用于存储C盘文件中的数据
2、定义读取流和c盘文件关联
3、不断读写完成数据存储
4、关闭资源
 */

package Day18;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyText {
    public static void main(String[] args) throws IOException {
        copy_1();
        copy_2();
    }

    //第一种方式：从C读取一个字符，就往D盘写一个字符
    public static void copy_1() throws IOException {

        //创建目的地,文件名
        FileWriter fileWriter = new FileWriter("C:\\Users\\xuyuanna\\HelloWorld_copy.txt");

        //与已有文件关联（被复制的文件）
        FileReader fileReader = new FileReader("C:\\Users\\xuyuanna\\IdeaProjects\\day1\\src\\Day1_9\\HelloWorld.java");

        int ch = 0;
        while ((ch = fileReader.read()) != -1) {
            fileWriter.write(ch);
        }

        fileWriter.close();
        fileReader.close();
    }

    //第二种方式
    public static void copy_2() {
        FileWriter fileWriter = null;
        FileReader fileReader = null;

        try {
            fileWriter = new FileWriter("C:\\Users\\xuyuanna\\HelloWorld_copy2.txt");
            fileReader = new FileReader("C:\\Users\\xuyuanna\\IdeaProjects\\day1\\src\\Day1_9\\HelloWorld.java");
            char[] buf = new char[1024];
            int length = 0;
            while ((length = fileReader.read(buf)) != -1) {
                fileWriter.write(buf, 0, length);
            }
        } catch (IOException e) {
            throw new RuntimeException("读写失败！");
        } finally {

            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {

                }
            }

            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {

                }
            }

        }

    }
}
