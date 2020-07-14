/*
定义端点接收数据并打印

服务端：
1、建立服务端的socket服务 ServerSocket
2、获取连接过来的客户端对象
    通过ServerSocket 的 accept 方法 阻塞式
3、客户端如果发过来数据，那么服务端要使用对应的客户端对象
    并获取到该客户端对象的读取流来读取发送过来的数据，并打印
4、关闭【可选】
 */
package Day23;

import org.omg.Messaging.SyncScopeHelper;

import java.io.*;
import java.net.*;

public class TCPServer {
    public static void main(String[] args) throws Exception {
//        建立服务端的socket服务
        ServerSocket serverSocket = new ServerSocket(40000);

//        通过accept 获取连接过来的客户端对象
        Socket accept = serverSocket.accept();

        String ip = accept.getInetAddress().getHostAddress();
        System.out.println(ip + "...connected");

//        获取客户端发送过来的数据，使用客户端对象的读取流方法
        InputStream in = accept.getInputStream();

        byte[] buf = new byte[1024];
        int len = in.read(buf);
        System.out.println(new String(buf, 0, len));


        accept.close();
        serverSocket.close();
    }
}
