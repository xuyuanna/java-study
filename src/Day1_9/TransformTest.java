package Day1_9;

public class TransformTest {
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer();
        System.out.println(stringBuffer);

        stringBuffer.append("123");
        System.out.println(stringBuffer);

        stringBuffer.append("456");
        System.out.println(stringBuffer);

         toBin(72);
    }

    /*
    十进制-->二进制
     */
    public static void toBin(int num){
        String s = "";
        while(num > 0){
            System.out.print(num % 2);
            s+=(num % 2);
            num = num / 2;
        }
        System.out.println();
        System.out.println(s);
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }

    }
}
