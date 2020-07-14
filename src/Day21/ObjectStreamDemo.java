
/*
静态不能被序列化
transient

 ObjectInputStream
 ObjectOutputStream
 成对使用
 */

package Day21;

import java.io.*;

public class ObjectStreamDemo {
    public static void main(String[] args) throws Exception {
        writeObj();
        readObj();
    }

    public static void readObj() throws Exception {
        ObjectInputStream ois =
                new ObjectInputStream(new FileInputStream("obj.txt"));
        Person person = (Person) ois.readObject();
        System.out.println(person);
        ois.close();
    }

    public static void writeObj() throws IOException {
        ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream("obj.txt"));
        oos.writeObject(new Person("lisi", 39));

        oos.close();
    }
}
