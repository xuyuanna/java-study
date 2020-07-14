package Day1_9;

//基本功能定在类中，扩展功能定在接口中
abstract class Studentt{
    abstract void study();

    void sleep(){
        System.out.println("sleep");
    }

}

//扩展功能
interface Smoking {
    public abstract void smoke();
}

//学习不抽烟
class Lisi extends Studentt{
    @Override
    void study(){};
}

//又学习又抽烟
class Zhangsan extends Studentt implements Smoking {
    @Override
    void study(){};
    @Override
    public void smoke(){};
}


public class InterfaceTest {
    public static void main(String[] args) {

    }
}
