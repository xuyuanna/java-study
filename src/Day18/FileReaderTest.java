/*
读取一个java文件，并打印在控制台上
 */
package Day18;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("C:\\Users\\xuyuanna\\IdeaProjects\\day1\\src\\Day1_9\\HelloWorld.java");

        char[] buf = new char[1024];

        int num = 0;
        while ((num = fileReader.read(buf)) != 0) {
            System.out.print(new String(buf, 0, num));
        }

        fileReader.close();
    }
}
