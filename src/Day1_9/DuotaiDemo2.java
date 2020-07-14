package Day1_9;/*
多态实例
A班学生：学习，坐着睡觉
B班学生：学习，躺着睡觉

可以将这两类事物进行抽取
 */

abstract class Sutdent{
    public abstract void study();
    public void sleep(){
        System.out.println("躺着睡");
    }
}

class ClassA extends Sutdent{
    @Override
    public void study(){
        System.out.println("Day1_9.A:study");
    }

    @Override
    public void sleep(){
        System.out.println("坐着睡");
    }
}

class ClassB extends Sutdent{
    @Override
    public void study(){
        System.out.println("Day1_9.B:study");
    }
}

class Dosth{
    public void dosth(Sutdent sutdent){
        sutdent.study();
        sutdent.sleep();
    }
}


public class DuotaiDemo2 {
    public static void main(String[] args) {

        Dosth dos = new Dosth();
        dos.dosth(new ClassA());
        dos.dosth(new ClassA());


    }


}
