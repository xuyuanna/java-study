/*
常见传输协议：
TCP：1、面向连接    2、大数据量传输    3、通过三次握手完成连接，可靠协议   4、效率较低  （（
UDP：1、面向无连接，2、数据会被封包，体积64K以内，3、不可靠，4、速度快    （（聊天，视频会议，桌面共享
 */
package Day23;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost.toString());
        System.out.println("address: " + localHost.getHostAddress());
        System.out.println("name: " + localHost.getHostName());

        System.out.println();

        InetAddress inetAddress = InetAddress.getByName("192.168.137.1");
        System.out.println("address: " + inetAddress.getHostAddress());
        System.out.println("name: " + inetAddress.getHostName());

        System.out.println();

        InetAddress baidu = InetAddress.getByName("www.baidu.com");
        System.out.println("baidu: "+baidu.getHostAddress());
    }
}
