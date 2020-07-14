package Day23;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(10004);

        Socket accept = serverSocket.accept();

        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(accept.getInputStream()));

        PrintWriter printWriter =
                new PrintWriter(new FileWriter("xxxxx.txt"), true);


        String line = null;

        while ((line = bufferedReader.readLine()) != null) {

            printWriter.println(line);
        }

        PrintWriter printWriter1 =
                new PrintWriter(accept.getOutputStream(), true);
        printWriter1.println("上传成功！");

        printWriter.close();
        accept.close();
        serverSocket.close();

    }
}
