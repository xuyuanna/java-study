
package Day18;

import java.util.Random;

public class MathDemo {
    public static void main(String[] args) {
        calculate();
        System.out.println();


        //随机返回 大于等于0.0，小于1.0 的 伪随机double值
        for (int i = 0; i < 10; i++) {
            double d = Math.random();
            System.out.println(d);
        }

        System.out.println();

        //返回大于等于0 小于10伪随机int值
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int x =random.nextInt(10);
//            int d = (int) (Math.random() * 10);
            System.out.println(x);
        }

    }

    public static void calculate() {
        //ceil 返回大于指定数据的最小整数
        double d = Math.ceil(3.1);
        System.out.println("ceil: d = " + d);

        //floor 返回小于指定数据的最大整数
        double d1 = Math.floor(3.1);
        System.out.println("floor: d1 = " + d1);

        //round 四舍五入
        long l = Math.round(12.54);
        System.out.println("round: l = " + l);

        //pow 返回a的b次幂
        double d2 = Math.pow(2, 3);
        System.out.println("pow: d2 = " + d2);
    }

}
