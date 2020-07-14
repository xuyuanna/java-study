/*
TCP传输：
1、分客户端和服务端
2、客户端对应的对象是Socket
    服务端对应的对象是ServerSocket
*/

/*
1、客户端：
在socket对象建立时，就可以连接指定主机
因为TCP是面向连接的，所以在建立socket服务时，
就要有服务端存在，并连接成功，形成通路后，在该通道进行数据传输

需求：给服务端发送一个文本数据

1、创建socket，并指定要连接的主机和端口
2、发送数据，应该获取socket流中的输出流

 */
package Day23;

import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws Exception {
        //创建客户端的socket服务。指定目的主机和端口
        Socket socket = new Socket("192.168.137.1", 40000);

        //发送数据，应该获取socket流中的输出流
        OutputStream out = socket.getOutputStream();

        out.write("TCP".getBytes());

        socket.close();
    }
}
