/*
服务端：
源：socket读取流
目的：socket输出流
都是文本，装饰
 */
package Day23;

import java.io.*;
import java.net.*;

public class ServerTest {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(10002);

        Socket accept = serverSocket.accept();

        String ip = accept.getInetAddress().getHostAddress();
        System.out.println(ip + "....connected!");

        //读取socket读取流中的数据
        BufferedReader bufferedReaderIn =
                new BufferedReader(new InputStreamReader(accept.getInputStream()));

        //目的，socket输出流。大写数据写入到socket输出流，并发送给客户端
//        BufferedWriter bufferedWriterOut =
//                new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
        PrintWriter printWriterOut = new PrintWriter(accept.getOutputStream(),true);

        String line = null;
        while ((line = bufferedReaderIn.readLine()) != null) {
            System.out.println(line);
            printWriterOut.println(line.toUpperCase());
//            bufferedWriterOut.write(line.toUpperCase());
//            bufferedWriterOut.newLine();
//            bufferedWriterOut.flush();
        }

        serverSocket.close();
        accept.close();

    }
}

/*
问题现象：
1、客户端和服务端都在等待：
因为客户端和服务端都有阻塞式方法，这些方法没有读到结束标记就会一直等待，导致两端都在等待
readLine();
 */
