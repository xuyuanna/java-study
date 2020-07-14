/*
打印流
该流提供了打印方法，可以将各种数据类型的数据都原样打印

PrintStream 字节打印流：
构造函数可以接收的参数类型：
1、file对象。File
2、字符串路径。String
3、字节输出流。OutputStream


PrintWriter 字符打印流：
构造函数可以接收的参数类型：
1、file对象。File
2、字符串路径。String
3、字节输出流。OutputStream
4、字符输出流。Writer
 */
package Day20;


import java.io.*;

public class PrintStreamDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        PrintWriter out = new PrintWriter(new FileWriter("aaaaa.txt"),true);

        //PrintWriter out = new PrintWriter(System.out,true);

        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            if("over".equals(line)){
                break;
            }
            out.println(line.toUpperCase());
        }
        out.close();
        bufferedReader.close();
    }
}

