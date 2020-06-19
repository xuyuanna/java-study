import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class Hello {
    public static void main(String[] args) {
        int a = 0;
        int b = 4;
        System.out.println(a + b);

        long c = 987;
        c += 5;
        System.out.println(c);

        char ch = 'a';
        char ch2 = 'b';
        System.out.println("3" + ch + ch2);

        byte f = 3;
        f = (byte) (f + 1);
        System.out.println(f);

        int x = 6750;
        x = x / 1000 * 1000;
        System.out.println(x);

        int v = 3, v1;
        v1 = v++;
        System.out.println("v的值是" + v);
        System.out.println("v1的值是" + v1);

        int n = 3, n1;
        n1 = ++n;
        System.out.println("n的值是" + n);
        System.out.println("n1的值是" + n1);
        System.out.println(n + n1);

        System.out.println("nidadih" + " " + "ssssss");
        System.out.println(5 + 5);
        System.out.println("5+5=" + (5 + 5));  //字符串
        System.out.println("ab" + 5 + 5);  //字符串

        System.out.println("HELLO\b WORLD");    //退格

        System.out.println("\"hello\"");    //转义字符，写在引号前面
        System.out.println("\\hello\\");

        char ch3 = '\n';    //换行
        System.out.println(ch3);

        char ch4 = '你';     //char 2个字节
        System.out.println(ch4);

        //赋值运算符
        short s = 5;
        //s = s + 5;
        s += 5;
        System.out.println(s);

        //比较运算符，==，!=，<=，>=，<，>,结果是boolean型，只有true和false
        System.out.println(5 == '5');

        /*
        逻辑运算符
        & 与：只要有false，就都为false
        | 或：只要有true，就都为true
        ^ 异或：两边相同的就为false，两边不同的就为true
         */
        System.out.println(true & false);
        System.out.println(true | false);
        System.out.println(false ^ false);


        // 短路运算符，在判断真假的情况下，无论如何一定要用短路运算符
        // 或只要一个是true结果就是true，如果第一个已经是true了，后面那个已经没必要看了，因为结果一定是true
        System.out.println(true || false);

        // 第一个是false，后面那个是true的话，结果就是true，后面那个是false的话，结果就是false，这个情况下，结果受到后面那个值的影响
        System.out.println(false || true);

        // and 必须是两个true 才能是true，如果第一个是false，那后面那个就没必要看了，因为一定是false
        System.out.println(false && true);

        // isFalse被忽略
        System.out.println(isTrue() || isFalse());

        System.out.println(isFalse() || isTrue());


        // isTrue被忽略
        System.out.println(isFalse() && isTrue());


        System.out.println(isTrue() && isTrue());

        System.out.println(1 >> 2);

        // 3
        System.out.println(3 & 3);
        // 0
        System.out.println(1 & 2);
        // 3
        System.out.println(3 | 0);
        // 3
        System.out.println(3 | 3);

        // if else
        int p = 5;
        if (p > 3) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        System.out.println("over");

        /*
        if else 结构简写格式：  变量 = (条件表达式)?表达式1:表达式2;
        条件表达式 成立的话，执行表达式1，不成立执行表达式2。
        好处：简化代码
        弊端：运算符运算完一定要有结果
         */
        // 三元运算符
        int o = 9, i;
        b = (o > 1) ? 100 : 200;
        System.out.println(b);

        if (isTrue()) {
            System.out.println("isTrue...");
        }

        if (isFalse()) {
            System.out.println("isFalse...");
        }
    }

    public static boolean isTrue() {
        System.out.println("this is true");
        return true;
    }

    public static boolean isFalse() {
        System.out.println("this is false");
        return false;
    }

}
