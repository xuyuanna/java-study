/*
对已有文件的数据续写
 */
package Day18;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo3 {
    public static void main(String[] args) {
        //传递一个true参数，代表不覆盖已有的文件，并在已有文件的末尾处进行数据的续写
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter("demo.txt", true);
            fileWriter.write("\n\n你好谢谢");
        } catch (IOException e) {
            System.out.println(e.toString());
        } finally {

            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                System.out.println(e.toString());
            }

        }
    }
}
