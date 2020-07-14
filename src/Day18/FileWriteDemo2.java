/*
IO异常处理方式
 */
package Day18;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo2 {
    public static void main(String[] args) {
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter("demo.txt");
            fileWriter.write("hello world");
        } catch (IOException e) {
            System.out.println(e.toString());
        } finally {

            try {
                if(fileWriter != null){
                    fileWriter.close();
                }
            } catch (IOException e) {
                System.out.println(e.toString());
            }

        }

    }
}
