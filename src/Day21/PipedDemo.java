package Day21;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedDemo {
    public static void main(String[] args) throws IOException {
        PipedInputStream in = new PipedInputStream();
        PipedOutputStream out = new PipedOutputStream();

        in.connect(out);

        Read read = new Read(in);
        Write write = new Write(out);

        new Thread(read).start();
        new Thread(write).start();


    }
}

class Read implements Runnable{
    private PipedInputStream in;

    Read(PipedInputStream in){
        this.in = in;
    }

    @Override
    public void run() {
        try {
            byte[ ] buf = new byte[1024];
            System.out.println("read.....");
            int len = in.read(buf);
            System.out.println("read....................");
            String s = new String(buf,0,len);
            System.out.println(s);
            in.close();
        }catch (IOException e){
            throw new RuntimeException("管道读取流失败");
        }
    }
}

class Write implements Runnable{
    private PipedOutputStream out;

    Write(PipedOutputStream out){
        this.out = out;
    }

    @Override
    public void run() {
        try {
            System.out.println("write.....");
            out.write("piped is coming".getBytes());
            out.close();
        }catch (IOException e){
            throw new RuntimeException("管道输出流失败");
        }
    }
}
