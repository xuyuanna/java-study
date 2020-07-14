package yuanna;

/**
 * 如果一个类不指定private跟public的话，那这个类就是friendly，就是只能在当前包可以访问
 * protected: 同个包跟这个类的子类可以访问
 * 不写（friendly）：同个包可以访问而已
 * private：自己可以访问
 * public：全部可以访问
 */
public class Woman {
    public static void main(String[] args) {
        People woman = new People();
        woman.show();
    }
}
