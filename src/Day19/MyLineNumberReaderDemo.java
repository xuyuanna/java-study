package Day19;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class MyLineNumberReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("buf.txt");
        MyLineNumberReader myLineNumberReader = new MyLineNumberReader(fileReader);
        String line = null;
        while ((line = myLineNumberReader.myReadLine()) != null) {
            System.out.println(myLineNumberReader.getLineNumber() + " : " + line);
        }

        myLineNumberReader.myClose();
    }
}

class MyLineNumberReader {
    private Reader reader;
    private int lineNumber;

    MyLineNumberReader(Reader reader) {
        this.reader = reader;
    }

    public String myReadLine() throws IOException {
        lineNumber++;
        StringBuilder stringBuilder = new StringBuilder();
        int ch = 0;
        while ((ch = reader.read()) != -1) {
            if (ch == 'r') {
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

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void myClose() throws IOException {
        reader.close();
    }
}
