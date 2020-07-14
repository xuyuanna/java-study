package Day23;


import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.lang.*;


public class TcpServer2 {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(10001);

        Socket accept = serverSocket.accept();

        String ip = accept.getInetAddress().getHostAddress();
        System.out.println(ip + "....connected");

        InputStream in = accept.getInputStream();

        byte[] buf = new byte[1024];

        int len = in.read(buf);

        System.out.println(new String(buf, 0, len));

        OutputStream out = accept.getOutputStream();
        out.write("收到".getBytes());

        serverSocket.close();
        accept.close();

    }
}
