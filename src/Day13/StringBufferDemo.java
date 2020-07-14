/*
StringBuffer是字符串缓冲区，是一个容器。
CURD：creat  update  read  delete

特点
1、长度是可以变化的
2、可以直接操作多个数据类型
3、最终会通过toString方法变回字符串

1、存储
    StringBuffer        append():将指定的数据作为参数添加到已有数据的结尾处
    StringBuffer        insert(index,数据):将指定的数据插入到指定的index位置
2、删除
    StringBuffer        delete(start, end):包含start，不包含end
    StringBuffer        deleteCharAt(index):删除指定位置的字符
3、获取
    char                charAt(int index)
    int                 indexOf(String str)
    int                 lastIndexOf(String str)
    int                 length()
    String              subString(int start, int end)
4、修改
    StringBuffer        replace(start,end,String) 包含头，不包含尾，把start到不包含end修改
    void                setCharAt(int index,char ch)

5、反转
    StringBuffer        reverse()

6、将缓冲区中的指定数据，存储到指定字符数组中
void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)

7、jdk1.5版本之后出现了 StringBuilder
StringBuffer 是线程同步的，更安全      多线程用StringBuffer
StringBuilder 是线程不同步的，效率     单线程用StringBuilder

开发建议使用StringBuilder
*/

package Day13;


public class StringBufferDemo {
    public static void main(String[] args) {
        add();
        System.out.println();

        delete();
        System.out.println();

        update();
        System.out.println();


        getChars();
    }

    public static void getChars() {
        StringBuilder sb = new StringBuilder("abcdefg");
        char[] chs = new char[7];
        sb.getChars(1, 4, chs, 4);
        for (int i = 0; i < chs.length; i++) {
            sop("char[" + i + "]:" + chs[i]);
        }
    }

    //update
    public static void update() {
        StringBuffer sb = new StringBuffer("你我好是yynncyxcy！");
        sb.replace(1, 4, "java");
        sop(sb.toString());

        StringBuffer sb2 = new StringBuffer("iawvhtxpl！");
        sb2.setCharAt(2, 's');
        sop(sb2.toString());
    }

    //delete
    public static void delete() {
        StringBuffer sb = new StringBuffer("你好我是xx！");

        sb.delete(1, 3);
        sop(sb.toString());

        sb.deleteCharAt(1);
        sop(sb.toString());

        //清空
        StringBuffer sb1 = new StringBuffer("asdafev！");
        sb1.delete(0, sb1.length());
        sop("清空：" + sb1);
    }

    //add
    public static void add() {
        StringBuffer sb = new StringBuffer();
        sb.append(34).append("你好").append(true);
        sb.insert(3, "ab");
        sop(sb.toString());
    }

    public static void sop(Object object) {
        System.out.println(object);
    }
}