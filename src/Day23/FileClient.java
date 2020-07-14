package Day23;

import java.io.*;
import java.net.Socket;

public class FileClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("192.168.137.1", 10004);

        BufferedReader bufferedReader =
                new BufferedReader(new FileReader("C:\\Users\\xuyuanna\\Desktop\\IPDemo.txt"));

        PrintWriter printWriter =
                new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);

        String line = null;

        while ((line = bufferedReader.readLine()) != null) {
            printWriter.println(line);
        }

        //关闭客户端的输出流，相当于给流加入了一个结束标记
        socket.shutdownOutput();

        BufferedReader bufferedReaderIn =
                new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String str = bufferedReaderIn.readLine();
        System.out.println(str);

        bufferedReader.close();
        socket.close();
    }
}
