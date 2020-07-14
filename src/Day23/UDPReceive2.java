package Day23;

import java.io.BufferedWriter;
import java.net.*;

public class UDPReceive2 {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(20000);

        while (true) {

            byte[] buf = new byte[1024];

            DatagramPacket dp = new DatagramPacket(buf, buf.length);

            ds.receive(dp);

            String id = dp.getAddress().getHostAddress();
            String data = new String(dp.getData(), 0, dp.getLength());
            int port = dp.getPort();

            System.out.println(id + "  :  " + data + "  :  " + port);

        }
    }
}
