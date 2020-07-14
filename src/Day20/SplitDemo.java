package Day20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.*;

public class SplitDemo {
    public static void main(String[] args) throws IOException {
        splitFile();
        merge();
    }

    public static void merge() throws IOException {
        ArrayList<FileInputStream> al = new ArrayList<>();
        for (int i = 1; i <= 7; i++) {
            al.add(new FileInputStream("C:\\新建文件夹\\splitFiles\\" + i + ".part"));
        }
        final Iterator<FileInputStream> iterator = al.iterator();
        Enumeration<FileInputStream> en = new Enumeration<FileInputStream>() {
            @Override
            public boolean hasMoreElements() {
                return iterator.hasNext();
            }

            @Override
            public FileInputStream nextElement() {
                return iterator.next();
            }
        };


        SequenceInputStream sis = new SequenceInputStream(en);
        FileOutputStream fos = new FileOutputStream("C:\\新建文件夹\\splitFiles\\0.bmp");
        byte[] buf = new byte[1024];
        int len = 0;
        while ((len = sis.read(buf)) != -1) {
            fos.write(buf, 0, len);
        }
        fos.close();
        sis.close();
    }

    public static void splitFile() throws IOException {
        FileInputStream fis = new FileInputStream("c:\\新建文件夹\\2.jpg");
        FileOutputStream fos = null;
        byte[] buf = new byte[1024];
        int len = 0;
        int count = 0;
        while ((len = fis.read(buf)) != -1) {
            fos = new FileOutputStream("c:\\新建文件夹\\splitFiles\\" + (++count) + ".part");
            fos.write(buf, 0, len);
            fos.close();
        }

        fis.close();
    }
}
