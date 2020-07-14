package Day19;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineNumberReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("buf.txt");
        LineNumberReader lineNumberReader = new LineNumberReader(fileReader);

        String line = null;
        lineNumberReader.setLineNumber(100);

        while ((line = lineNumberReader.readLine())!=null){
            System.out.println(lineNumberReader.getLineNumber()+" : "+line);
        }

        lineNumberReader.close();
    }
}
