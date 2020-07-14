/*
多线程：
编写一个聊天程序
收数据和发数据的部分，同时执行
 */
package Day23;

import java.io.*;
import java.net.*;


public class ChatDemo {
    public static void main(String[] args) throws Exception {
        DatagramSocket sendSocket = new DatagramSocket();
        DatagramSocket receiveSocket = new DatagramSocket(30000);

        new Thread(new Send(sendSocket)).start();
        new Thread(new Receive(receiveSocket)).start();

    }
}

class Send implements Runnable {
    private DatagramSocket ds;

    public Send(DatagramSocket ds) {
        this.ds = ds;
    }

    @Override
    public void run() {
        try {
            BufferedReader bufferedReader =
                    new BufferedReader(new InputStreamReader(System.in));
            String line = null;

            while ((line = bufferedReader.readLine()) != null) {
                if ("886".equals(line)) {
                    break;
                }
                byte[] buf = line.getBytes();
                DatagramPacket dp =
                        //局域网广播地址 192.168.1.255
                        new DatagramPacket(buf, buf.length, InetAddress.getByName("192.168.1.255"), 30000);

                ds.send(dp);
            }
        } catch (Exception e) {
            throw new RuntimeException("发送失败");
        }

    }
}

class Receive implements Runnable {
    private DatagramSocket ds;

    public Receive(DatagramSocket ds) {
        this.ds = ds;
    }

    @Override
    public void run() {
        try {
            while (true) {

                byte[] buf = new byte[1024];
                DatagramPacket dp =
                        new DatagramPacket(buf, buf.length);

                ds.receive(dp);

                String ip = dp.getAddress().getHostAddress();

                String data = new String(dp.getData(), 0, dp.getLength());

                int port = dp.getPort();

                System.out.println(ip + "..." + data + "..." + port);

            }

        } catch (Exception e) {
            throw new RuntimeException("接收失败");
        }

    }
}
