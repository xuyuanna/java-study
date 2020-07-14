/*
列出指定目录下文件或者文件夹，包含子目录中的内容
也就是列出指定目录下的所有内容

因为目录中还有目录，只要使用同一个列出目录功能的函数即可
在列出过程中出现的还是目录的话，就再次调用本功能
也就是函数自身调用自身：：递归

递归 注意
1、限定条件
2、要注意递归的次数，避免内存溢出
 */
package Day20;

import java.io.File;

public class AllFilesDemo {
    public static void main(String[] args) {
        toBin(6);
        System.out.println("-------------------");

        int n = getSum(10);
        System.out.println(n);
        System.out.println("-------------------");


        File dir = new File("c:\\test");
        showDir(dir, 0);

    }

    public static void showDir(File dir, int level) {
        File[] files = dir.listFiles();
        System.out.println("dir:  " + getLevel(level) + dir.getName());
        level++;
        for (int x = 0; x < files.length; x++) {
            if (files[x].isDirectory()) {
                showDir(files[x], level);
            } else {
                System.out.println(getLevel(level) + files[x]);
            }
        }
    }

    public static String getLevel(int level) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < level; i++) {
            stringBuilder.append("  ");
        }
        return stringBuilder.toString();
    }

    //递归
    public static void toBin(int num) {
        if (num > 0) {
            toBin(num / 2);
            System.out.println(num % 2);
        }
    }

    //1-10 求和
    public static int getSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + getSum(n - 1);
        }
    }
}
