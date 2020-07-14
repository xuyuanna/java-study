/*
需求：通过udp传输方式，将一段文字数据发送出去

1、建立udpsocket服务，通过 DatagramSocket
2、提供数据，并将数据封装到数据包中
3、通过socket服务的发送功能，将数据包发出去
4、关闭资源

DatagramPacket(byte[] buf, int length, InetAddress address, int port)
 */
package Day23;

import java.net.*;

public class UDPSend {
    public static void main(String[] args) throws Exception {
//        1、建立udpsocket服务，通过 DatagramSocket
        DatagramSocket ds = new DatagramSocket();

//        2、提供数据，并将数据封装到数据包中
        byte[] buf = "udp send".getBytes();
        DatagramPacket dp =
                new DatagramPacket(buf, buf.length, InetAddress.getByName("192.168.1.255"), 10000);

//        3、通过socket服务的发送功能，将数据包发出去
        ds.send(dp);

//        4、关闭资源
        ds.close();


    }
}



