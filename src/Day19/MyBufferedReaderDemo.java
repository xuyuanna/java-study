/*
自定义一个类中包含一个功能和ReadLine一致的方法

 */

package Day19;


import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class MyBufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("buf.txt");
        MyBufferedReader myBufferedReader = new MyBufferedReader(fileReader);
        String line = null;
        while ((line = myBufferedReader.myReadLine()) != null) {
            System.out.println(line);
        }
        myBufferedReader.myClose();
    }
}

class MyBufferedReader extends Reader {
    private Reader reader;

    MyBufferedReader(Reader reader) {
        this.reader = reader;
    }

    //可以一次读一行的方法
    public String myReadLine() throws IOException {
        //定义一个临时容器，原BufferedReader封装的是字符数组
        //定义一个StringBuilder容器，最终要将数据变成字符串
        StringBuilder stringBuilder = new StringBuilder();
        int ch = 0;
        while ((ch = reader.read()) != -1) {
            if (ch == '\r') {
                continue;
            }
            if (ch == '\n') {
                return stringBuilder.toString();
            } else {
                stringBuilder.append((char) ch);
            }
        }
        if (stringBuilder.length() != 0) {
            return stringBuilder.toString();
        }
        return null;
    }

    /*
    覆盖Reader类中的抽象方法
     */

    @Override
    public void close() throws IOException {
        reader.close();
    }

    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        return reader.read(cbuf, off, len);
    }

    public void myClose() throws IOException {
        reader.close();
    }
}
