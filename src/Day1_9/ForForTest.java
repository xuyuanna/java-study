package Day1_9;

/*
    for语句嵌套形式
 */
public class ForForTest {
    public static void main(String[] args) {

        for (int x = 0, sum = 0; x < 3; x++) {
            for (int y = 0; y < 4; y++) {   //y循环体执行完才会继续执行x循环体
                sum++;
                System.out.println(sum);   //12
            }
        }

        for (int a = 0; a < 3; a++) {
            for (int b = 0; b < 4; b++) {  //y循环体执行完才会继续执行x循环体
                System.out.print("♥");    //不换行
            }
            System.out.println();    //只有一个功能就是换行
        }
        //对于打印长方形，外循环控制的是行数，内循环控制的是每一行的列数，也就是一行中元素的个数。
        //尖朝上，可以改变条件，让条件随着外循环变化
        //尖朝下，可以改变初始化值，让初始化值随着外循环变化

        System.out.println("-------------------- ");

        for (int m = 1; m <= 5; m++) {
            for (int n = 5; n >=m; n--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-------------------- ");

        for (int p = 1; p <= 5; p++) {
            for (int q = 1; q <=p ; q++) {
                System.out.print("*");
            }
            System.out.println();
        }




    }
}
