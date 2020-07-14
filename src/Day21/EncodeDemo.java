/*
编码：字符串变成字节数组

解码：字节数组变成字符串
默认UTF8
String-->byte[]： str.getBytes(charsetName)

byte[]-->String： new String(byte[], charsetName)

 */

package Day21;

import org.omg.Messaging.SyncScopeHelper;

import java.util.Arrays;

public class EncodeDemo {
    public static void main(String[] args) throws Exception {
        String s = "你好";

        //编码 UTF8
        byte[] b1 = s.getBytes();
        System.out.println("UTF8 = " + Arrays.toString(b1));

        byte[] b2 = s.getBytes("GBK");
        System.out.println("GBK = " + Arrays.toString(b2));


        //解码
        String s1 = new String(b1, "GBK");
        System.out.println("GBK = " + s1);

        String s2 = new String(b1);
        System.out.println("UTF8 = " + s2);

        System.out.println("---------------");

        //乱码
        String s3 = new String(b1,"ISO8859-1");
        System.out.println(s3);
        //对s3进行iso8859-1编码
        byte[] b3 = s3.getBytes("ISO8859-1");
        System.out.println(Arrays.toString(b3));

        String s4 = new String(b3);
        System.out.println(s4);
    }
}
