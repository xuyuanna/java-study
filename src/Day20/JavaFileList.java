/*
将一个指定目录下的java文件的绝对路径，存储到一个文本文件中
建立一个java文件列表文件

1、对指定的目录进行递归
2、获取递归过程中所有的java文件的路径
3、将路径存储到List集合中
4、将集合的数据写入到一个文件中    BufferedWriter
 */
package Day20;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JavaFileList {
    public static void main(String[] args) throws IOException {
        File dir = new File("C:\\新建文件夹");
        List<File> list = new ArrayList<>();
        fileToList(dir, list);
//        System.out.println(list.size());

        File file = new File(dir, "javalist.txt");
        writeToFile(list, file.toString());
    }

    public static void fileToList(File dir, List<File> list) {
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                fileToList(file, list);
            } else {
                if (file.getName().endsWith(".txt")) {
                    list.add(file);
                }
            }
        }
    }

    public static void writeToFile(List<File> list, String javaListFile) throws IOException {
        BufferedWriter bufferedWriter = null;

        try {
            bufferedWriter = new BufferedWriter(new FileWriter(javaListFile));

            for (File file : list) {
                String path = file.getAbsolutePath();
                bufferedWriter.write(path);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }

        } catch (IOException e) {
            throw e;
        } finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                throw e;
            }
        }
    }
}

