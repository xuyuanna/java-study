/*
获取两个字符串中最大相同的子串
abcwerthelloyuiodef
cvhellobnm
 */

package Day13;

public class StringTest3 {
    public static void main(String[] args) {
        String string1 = "abcwerthelloyuiodef";
        String string2 = "cvhellobnm";
//        sop(":"+getMaxSubString(string1, string2));
        String trueStr = String.valueOf(true);

        System.out.println(trueStr.substring(0, 2));

        String s = null;
        System.out.println("HELLO".equalsIgnoreCase(s));

    }

    //获取两个字符串中最大相同的子串
    public static String getMaxSubString(String string1, String string2) {
        String max = "", min = "";
        max = (string1.length() > string2.length()) ? string1 : string2;
        min = (max == string1) ? string2 : string1;

        sop("max = "+max+"..........min = "+min);



        for (int x = 0; x < min.length(); x++) {

            for (int y = 0, z = min.length() - x; z != min.length() + 1; y++, z++) {

                String temp = min.substring(y, z);
                System.out.println(temp+".."+y+".."+z);
                System.out.println("------");

                //if(string.indexOf(temp)!=-1)
                if (string1.contains(temp)) {
                    return temp;
                }

            }

        }

        return "";
    }


    public static void sop(Object object) {
        System.out.println(object);
    }
}
