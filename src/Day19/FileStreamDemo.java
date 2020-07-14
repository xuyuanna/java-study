/*
想要操作图片，用字节流
InputStream   OutputStream
 */

package Day19;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("---------1----------");
        readFile_1();
        System.out.println("---------2----------");
        readFile_2();
        System.out.println("---------3----------");

        readFile_3();
    }

    public static void readFile_1() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("buf.txt");
        int ch = 0;
        while ((ch = fileInputStream.read()) != -1) {
            System.out.println((char) ch);
        }
        fileInputStream.close();

    }

    public static void readFile_2() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("buf.txt");
        byte[] bytes = new byte[1024];
        int length = 0;
        while ((length = fileInputStream.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, length));
        }
        fileInputStream.close();
    }

    public static void readFile_3() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("buf.txt");

        //定义一个刚刚好的缓冲区，不用循环了
        byte[] bytes = new byte[fileInputStream.available()];

        fileInputStream.read(bytes);

        System.out.println(new String(bytes));

        fileInputStream.close();


    }

    public static void writeFile() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("buf.txt");
        fileOutputStream.write("abcde".getBytes());

        fileOutputStream.close();
    }
}



