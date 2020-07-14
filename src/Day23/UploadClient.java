package Day23;

import java.io.*;
import java.net.Socket;

public class UploadClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("192.168.137.1", 10003);

//        BufferedReader bufferedReader =
//                new BufferedReader(new FileReader("IPDemo.java"));

        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));

        PrintWriter printWriter =
                new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);

        String line = null;

        while ((line = bufferedReader.readLine()) != null) {
            if ("over".equals(line)){
                break;
            }
            printWriter.println(line);
        }

//        socket.shutdownOutput();



        bufferedReader.close();
        socket.close();

    }
}
