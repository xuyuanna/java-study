/*
删除一个带内容的目录。

在Windows中，删除目录从里面往外删除的。

递归
 */
package Day20;

import java.io.File;

public class RemoveDir {
    public static void main(String[] args) {
        File file = new File("c:\\delete");
        removeDir(file);
    }

    public static void removeDir(File dir) {
        File[] files = dir.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (!files[i].isHidden() && files[i].isDirectory()) {
                removeDir(files[i]);
            } else {
                files[i].delete();
            }
        }

        System.out.println(dir.delete());
    }
}
