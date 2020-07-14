package Day19;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Properties;

public class SystemInfo {
    public static void main(String[] args) throws FileNotFoundException {
        Properties properties = System.getProperties();
        properties.list(new PrintStream("systeminfo.txt"));
    }
}
