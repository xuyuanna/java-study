/*
log4j
 */
package Day19;

import java.io.IOException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionInfo {
    public static void main(String[] args) {
        try {
            int[] arr = new int[2];
            System.out.println(arr[3]);
        } catch (Exception e) {
            try {
                Date d =new Date();
                SimpleDateFormat simpleDateForma = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String s = simpleDateForma.format(d);

                PrintStream ps = new PrintStream("exception1.log");
                ps.println(s);
                System.setOut(ps);

            } catch (IOException ex) {
                throw new RuntimeException("日志文件创建失败");
            }
            e.printStackTrace(System.out);
        }
    }
}
