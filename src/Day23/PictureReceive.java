package Day23;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class PictureReceive {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(10005);

        Socket socket = serverSocket.accept();

        InputStream in = socket.getInputStream();

        FileOutputStream fileOutputStream =
                new FileOutputStream("server.bmp");

        byte[] buf = new byte[1024];
        int len = 0;
        while ((len = in.read(buf)) != -1) {
            fileOutputStream.write(buf, 0, len);
        }

        OutputStream out = socket.getOutputStream();
        out.write("上传成功".getBytes());

        fileOutputStream.close();
        socket.close();
        serverSocket.close();
    }
}
