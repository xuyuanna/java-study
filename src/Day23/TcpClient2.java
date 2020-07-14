/*
演示tcp的传输的客户端和服务端的互访

需求：客户端给服务端发送数据，服务端收到后，给客户端反馈信息
 */


/*
客户端：
1、建立socket服务，指定要连接的主机和端口
2、获取socket流中的输出流，将数据写到该流中
3、获取socket流中的输入流，将服务端反馈的数据获取到并打印
4、关闭资源
 */
package Day23;


import java.io.*;
import java.net.Socket;

public class TcpClient2 {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("192.168.137.1", 10001);

        OutputStream out = socket.getOutputStream();


        out.write("你好".getBytes());

        InputStream in = socket.getInputStream();

        byte[] buf = new byte[1024];
        int len = in.read(buf);
        System.out.println(new String(buf, 0, len));

        socket.close();
    }

}
