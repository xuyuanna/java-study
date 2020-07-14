/*
用于操作字节数组的流对象：
ByteArrayInputStream：构造的时候需要接收数据源，而且数据源是一个字节数组

ByteArrayOutputStream：构造的时候，不用定义数据目的，
因为该对象中已经内部封装了可变长度的字节数组（数据目的地）

这两个流对象都是操作数组，没有使用系统资源，所以不用进行close关闭


源设备：
    键盘 System.in    硬盘 FileStream   内存 ArrayStream
目的设备：
    键盘 System.out    硬盘 FileStream   内存 ArrayStream

用流的读写思想来操作数据

操作字符数组：
CharArrayWriter
CharArrayReader

操作字符串：
StringWriter
StringReader
 */

package Day21;

import java.io.*;

public class ByteArrayDemo {
    public static void main(String[] args) throws IOException {
        //数据源
        ByteArrayInputStream bis = new ByteArrayInputStream("ABCDEFG".getBytes());

        //数据目的
        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        int by = 0;
        while ((by = bis.read()) != -1) {
            bos.write(by);
        }

        System.out.println("size: " + bos.size());
        System.out.println("bos: " + bos.toString());

        bos.writeTo(new FileOutputStream("writeTo.txt"));
    }

}
