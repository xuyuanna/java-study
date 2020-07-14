/*
模拟trim功能，去掉字符串两端的空格
 */
package Day13;

import static jdk.nashorn.internal.objects.NativeArray.reverse;

public class StringTest {
    public static void sop(String string) {
        System.out.println(string);
    }

    public static void main(String[] args) {

        //去掉两端空格
        String string = "    abc def    ";
        sop("去掉空格：<" + myTrim(string) + ">");

        //反转
        String string2 = "  qweasdzxc       ";
        sop(string2);
        sop("反转：<" + reverseString(string2,3,5) + ">");

        String string3 = "nishuoshenmene";
        sop(string3);
        sop("全部反转：<" + reverseString(string3) + ">");

    }

    //去除字符串两端的空格
    public static String myTrim(String string) {
        int start = 0, end = string.length() - 1;
        while (start <= end && string.charAt(start) == ' ') {
            start++;
        }
        while (start <= end && string.charAt(end) == ' ') {
            end--;
        }
        return string.substring(start, end + 1);
    }

    //将字符串反转。1、将字符串变成数组 2、对数组反转 3、将数组变成字符串
    public static String reverseString(String string, int start, int end) {
        //1、将字符串变成数组
        char[] chs = string.toCharArray();

        //2、对数组反转
        reverse(chs,start,end);

        //3、将数组变成字符串
        return new String(chs);
    }

    public static String reverseString(String string) {
        return reverseString(string,0,string.length()-1);
    }

    private static void reverse(char[] arr,int x,int y) {
        for (int start = x, end = y; start < end; start++, end--) {
            swap(arr, start, end);
        }
    }
    private static void swap(char[] arr, int x, int y){
        char temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}

