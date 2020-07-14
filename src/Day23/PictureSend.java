/*
上传图片
 */


/*
客户端
 */
package Day23;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class PictureSend {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("192.168.137.1", 10005);

        BufferedInputStream bufferedInputStream =
                new BufferedInputStream(new FileInputStream("C:\\Users\\xuyuanna\\Desktop\\1.jpg"));

        OutputStream out = socket.getOutputStream();

        byte[] buf = new byte[1024];
        int len = 0;
        while ((len = bufferedInputStream.read(buf)) != -1) {
            out.write(buf, 0, len);
        }

        socket.shutdownOutput();

        InputStream in = socket.getInputStream();
        byte[] bufIn = new byte[1024];
        int num = in.read(bufIn);
        System.out.println(new String(bufIn, 0, num));

        bufferedInputStream.close();
        socket.close();
    }
}
