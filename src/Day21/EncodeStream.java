package Day21;

import java.io.*;

public class EncodeStream {
    public static void main(String[] args) throws IOException {
//        writeText();
        readText();
    }


    public static void writeText() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("UTF8.txt"), "UTF8");
        osw.write("新年快乐");
        osw.close();
    }

    public static void readText() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("UTF8.txt"), "UTF8");
        char[] buf = new char[10];
        int len = isr.read(buf);
        String str = new String(buf, 0, len);
        System.out.println(str);
        isr.close();
    }
}
