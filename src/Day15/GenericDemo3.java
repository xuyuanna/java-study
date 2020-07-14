/*泛型类
什么时候定义泛型类？？？？
当类中要操作的引用数据类型不确定的时候，
早期定义Object来完成扩展
现在定义泛型来完成扩展
 */

package Day15;

public class GenericDemo3 {
    public static void main(String[] args) {

        People1<Cat> yuanna = new People1<>();
        yuanna.setObject(new Cat());
        Cat cat = yuanna.getObject();
        cat.jiaoSheng();

        People1<Dog> xcf = new People1<>();
        xcf.setObject(new Dog());
        Dog dog = xcf.getObject();
        dog.jiaoSheng();

    }
}

class Cat {

    public void jiaoSheng() {
        System.out.println("miao~~~~");
    }

}

class Dog {

    public void jiaoSheng() {
        System.out.println("wang~~~~");
    }

}

// 每个人养的动物可能不同，所以将宠物定义成泛型，然后new这个对象的时候，再去指定这个泛型到底是什么类型class
class People1<Pet> {
    private Pet pet;

    public void setObject(Pet pet) {
        this.pet = pet;
    }

    public Pet getObject() {
        return pet;
    }
}

//泛型前做法

//class Tool {
//    private Object object;
//
//    public void setObject(Object worker) {
//        this.object = worker;
//    }
//
//    public Object getObject() {
//        return object;
//    }
//}


/*
class Tool{
    private Worker worker;
    public void setWorker(Worker worker){
        this.worker = worker;
    }
    public Worker getWorker(){
        return worker;
    }
}
*/
