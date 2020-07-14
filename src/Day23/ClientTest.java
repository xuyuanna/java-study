/*
需求：建立一个文本转换服务器
客户端给服务端发送文本，服务端会将文本转换成大写，再返回给客户端
而且客户端可以不断进行文本转换，当客户端输入over，转换结束

1、建立服务
2、获取键盘录入
3、将数据发给服务端
4、获取服务端返回的大写数据
5、关闭资源

都是文本数据，可以使用字符流进行操作，同时提高效率，加入缓冲
 */
package Day23;

import java.io.*;
import java.net.*;

public class ClientTest {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("192.168.137.1", 10002);

        //定义读取键盘数据的流对象
        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));

        //定义目的，将数据写入到socket输出流，发给服务端
//        BufferedWriter bufferedWriterOut =
//                new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        PrintWriter printWriterOut = new PrintWriter(socket.getOutputStream(), true);


        //定义一个socket读取流，读取服务端返回的大写信息
        BufferedReader bufferedReaderIn =
                new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String line = null;

        while ((line = bufferedReader.readLine()) != null) {
            if ("over".equals(line)) {
                break;
            }
//            bufferedWriterOut.write(line);
//            bufferedWriterOut.newLine();
//            bufferedWriterOut.flush();

            printWriterOut.println(line);
            String str = bufferedReaderIn.readLine();
            System.out.println("server: " + str);
        }

        bufferedReader.close();
        socket.close();
    }
}

