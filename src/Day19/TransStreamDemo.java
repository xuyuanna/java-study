/*
将字节流转成字符流，再使用字符流缓冲区的readLine方法

1、需求：
源：键盘录入
目的：控制台
 */
package Day19;

import java.io.*;

public class TransStreamDemo {
    public static void main(String[] args) throws IOException {
        //获取键盘录入对象。字节流
//        InputStream in = System.in;

        //将字节流对象转换成字符流对象，要使用转换流 InputStreamReader
//        InputStreamReader inputStreamReader = new InputStreamReader(in);

        //为了提高效率，将字符流进行缓冲区技术的高效操作，使用 BufferedReader
//        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

//        OutputStream out = System.out;
//        OutputStreamWriter outputStreamWriter =new OutputStreamWriter(out);
//        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = null;
        while ((line=bufferedReader.readLine())!=null){
            if ("over".equals(line)){
                break;
            }else{
                bufferedWriter.write(line.toUpperCase());
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        }
        bufferedReader.close();
    }
}
