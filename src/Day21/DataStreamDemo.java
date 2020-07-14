/*
DataInputStream
DataOutputStream
可以用于操作基本数据类型的数据的流对象
 */
package Day21;

import java.io.*;

public class DataStreamDemo {
    public static void main(String[] args) throws IOException {
        writeData();
        readData();

        System.out.println();

        writeUTFDemo();
        readUTFDemo();
//        writeDemo();
    }

    public static void writeData() throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.txt"));
        dos.writeInt(234);
        dos.writeBoolean(true);
        dos.writeDouble(9887.543);

        dos.close();
    }

    public static void readData() throws IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"));

        int num = dis.readInt();
        boolean b = dis.readBoolean();
        double d = dis.readDouble();

        dis.close();

        System.out.println("num = " + num);
        System.out.println("b = " + b);
        System.out.println("d = " + d);
    }

    public static void writeUTFDemo() throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("utf.txt"));
        dos.writeUTF("新年快乐");
        dos.close();

    }

    public static void readUTFDemo() throws IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream("utf.txt"));
        String s = dis.readUTF();
        System.out.println("s = " + s);
        dis.close();
    }

    public static void writeDemo() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("UTF2.txt"), "utf-8");
        osw.write("新年快乐");
        osw.close();
    }


}
