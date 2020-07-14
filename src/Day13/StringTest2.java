package Day13;

public class StringTest2 {
    public static void main(String[] args) {
        String string = "abcdefghijdemnsdawdenvibvdevve";
        sop("出现次数： "+getCount(string,"de"));
        sop("不建议使用切割："+(string.split("de").length));
    }

    //获取字符串中，另一个字符串出现的次数
    public static int getCount(String string, String key) {
        int count = 0;
        int index = 0;

        while ((index =string.indexOf(key,index))!=-1) {
            index += key.length();
            count++;
        }
        return count;
    }

    public static void sop(Object object) {
        System.out.println(object);
    }
}
