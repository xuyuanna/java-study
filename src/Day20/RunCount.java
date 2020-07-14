/*
用于记录应用程序运行的次数，如果次数已到，就给出注册提示

要建立一个配置文件，要记录住软件的使用次数
该配置文件使用键值对的形式。便于阅读操作数据

键值对数据是map集合
数据是以文件形式存储，使用io技术
map+io---->properties

配置文件可以实现应用程序数据的共享

 */
package Day20;

import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class RunCount {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();

        File file = new File("count.properties");
        if (!file.exists()){
            file.createNewFile();
        }

        FileInputStream fis = new FileInputStream(file);
        prop.load(fis);

        int count = 0;

        String value = prop.getProperty("time");
        if (value!=null){
            count = Integer.parseInt(value);
            if (count>=5){
                System.out.println("使用次数已到");
                return;
            }
        }
        count++;
        prop.setProperty("time",count+"");

        FileOutputStream fos = new FileOutputStream(file);
        prop.store(fos,"");

        fos.close();
        fis.close();
    }
}
