/*
通过缓冲区复制一个.java文件
 */
package Day19;

import java.io.*;

public class CopyTextDemo {
    public static void main(String[] args)  {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("buf.txt"));
            bufferedWriter = new BufferedWriter(new FileWriter("buf_copy.txt"));
            String line = null;

            while ((line = bufferedReader.readLine())!=null){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        }catch (IOException e){
            throw new RuntimeException("失败！");
        }finally {
            try {
                if(bufferedWriter!=null){
                    bufferedWriter.close();
                }
            }catch (IOException e){
                throw new RuntimeException("关闭失败！");
            }
            try {
                if (bufferedReader!=null){
                    bufferedReader.close();
                }
            }catch (IOException e){
                throw new RuntimeException("关闭失败！");
            }
        }
    }
}
