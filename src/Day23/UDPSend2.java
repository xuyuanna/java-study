package Day23;

import java.io.*;
import java.net.*;

public class UDPSend2 {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

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

        ds.close();
    }
}
