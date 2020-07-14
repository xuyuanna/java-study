/*
泛型定义在接口上
 */

package Day15;

public class GenericDemo5 {
    public static void main(String[] args) {
//        InterImpl ii = new InterImpl();
//        ii.show("你好");

        InterImpl<Integer> i = new InterImpl<>();
        i.show(4);
    }
}

//泛型定义在接口上
interface Inter<T> {
    void show(T t);
}

class InterImpl <T> implements Inter<T>{

    @Override
    public void show(T t) {
        System.out.println("show:" + t);
    }
}

/*
class InterImpl implements Inter<String> {

    @Override
    public void show(String s) {
        System.out.println("show: " + s);
    }
}
*/
