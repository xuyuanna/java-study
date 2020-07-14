/*
读取键盘录入

需求：通过键盘录入数据，当录入一行数据后，就将该行数据进行打印
如果录入的是over，就停止录入

readLine方法是字符流BufferedReader类中的方法
键盘录入的read方法是字节流InputStream的方法

将字节流转成字符流，再使用字符流缓冲区的readLine方法

字符流：
FileReader
FileWriter

BufferedReader
BufferedWriter

字节流：
FileInputStream
FileOutputStream

BufferedInputStream
BufferedOutputStream


 */
package Day19;

import java.io.IOException;
import java.io.InputStream;

public class ReadInDemo {
    public static void main(String[] args) throws IOException {
//        InputStream in = System.in;
//        int by = in.read();
//        int by2 = in.read();
//        int by3 = in.read();
//        System.out.println(by);
//        System.out.println(by2);
//        System.out.println(by3);

        test1();
    }

    public static void test1() throws IOException {
        InputStream in = System.in;
        StringBuilder stringBuilder = new StringBuilder();
        while (true) {
            int ch = in.read();
            if (ch == '\r') {
                continue;
            }
            if (ch == '\n') {
                String s = stringBuilder.toString();
                if (s.equals("over")) {
                    break;
                }
                System.out.println(s.toUpperCase());
                stringBuilder.delete(0,stringBuilder.length());
            } else {
                stringBuilder.append((char) ch);
            }
        }


    }

}
