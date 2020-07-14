package Day23;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10003);

        Socket accept = serverSocket.accept();

        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(accept.getInputStream()));

        PrintWriter printWriter =
                new PrintWriter(new FileWriter("xxx.txt"), true);


        String line = null;

        while ((line = bufferedReader.readLine()) != null) {

            printWriter.println(line);
        }

        PrintWriter printWriter1 =
                new PrintWriter(accept.getOutputStream());
        printWriter1.println("上传成功！");

        bufferedReader.close();
        accept.close();
        serverSocket.close();


    }
}
