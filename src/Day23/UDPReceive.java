/*
定义一个应用程序，用于接收udp传输协议的数据并处理的

1、定义udpsocket服务。
    通常会监听一个端口，其实就是给这个接收网络应用程序定义数字标识
    方便于明确哪些数据过来该应用程序可以处理
2、定义一个数据包，要存储接收到的字节数据。
    因为数据包有多功能可以提取字节数据中的不同数据信息
3、通过socket服务的receive方法将收到的数据存入定义好的数据包中
4、通过数据包对象特有功能，将这些不同的数据取出
5、关闭资源

DatagramPacket(byte[] buf, int length)
 */
package Day23;

import java.net.*;


public class UDPReceive {
    public static void main(String[] args) throws Exception {
//        1、创建udpsocket服务，建立端点
        DatagramSocket ds = new DatagramSocket(10000);

//        2、定义数据包，用于存储数据
        byte[] buf = new byte[1024];
        DatagramPacket dp =
                new DatagramPacket(buf, buf.length);

//        3、通过socket服务的receive方法将收到的数据存入定义好的数据包中
        ds.receive(dp);

//        4、通过数据包对象特有功能，将这些不同的数据取出
        String ip = dp.getAddress().getHostAddress();

        String data = new String(dp.getData(), 0, dp.getLength());

        int port = dp.getPort();  //端口

        System.out.println("ip: " + ip);
        System.out.println("data: " + data);
        System.out.println("port: " + port);

//        5、关闭资源
        ds.close();
    }
}
