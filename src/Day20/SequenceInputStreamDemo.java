/*
SequenceInputStream
对多个流进行合并
 */

package Day20;

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInputStreamDemo {
    public static void main(String[] args) throws IOException {
        Vector<FileInputStream> vector = new Vector<>();
        vector.add(new FileInputStream("C:\\新建文件夹\\1.txt"));
        vector.add(new FileInputStream("C:\\新建文件夹\\2.txt"));
        vector.add(new FileInputStream("C:\\新建文件夹\\3.txt"));

        Enumeration<FileInputStream> en = vector.elements();
        SequenceInputStream sis = new SequenceInputStream(en);
        FileOutputStream fos = new FileOutputStream("C:\\新建文件夹\\4.txt");

        byte[] buf = new byte[1024];
        int len = 0;
        while ((len = sis.read(buf)) != -1) {
            fos.write(buf, 0, len);

        }
        fos.close();
        sis.close();
    }
}
