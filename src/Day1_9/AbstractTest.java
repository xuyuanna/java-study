package Day1_9;/*
假如我们在开发一个系统时需要对员工进行建模，员工包含3个属性：姓名、工号以及工资
经理也是员工，除了含有y员工的属性外，还有一个 奖金 的属性，
请使用继承的思想设计出员工类和经理类，要求类中提供必要的方法进行属性访问
 */

//全体员工
abstract class Employee{

    private String name;
    private String id;
    private double pay;

    Employee(String name, String id, double pay){
        this.name = name;
        this.id = id;
        this.pay = pay;
        System.out.println(name+"+"+id+"+"+pay);
    }

    public abstract void work();



}

//普通员工
class Professional extends Employee{
    Professional(String name, String id, double pay){
        super(name, id, pay);
    }

    public void work(){
        System.out.println("professional work");
    }
}

//经理
class Manager extends Employee{
    private int bonus;

    Manager(String name, String id, double pay, int bonus){
        super(name, id, pay);
        this.bonus = bonus;
        System.out.println(bonus);
    }

    public void work(){
        System.out.println("manager work");
    }

}



public class AbstractTest {
    public static void main(String[] args) {
        Professional pro = new Professional("lisa","客服001",2800.22);
        pro.work();

        System.out.println("-----------");

        Manager manager = new Manager("lisi","经理01",5800.22,9949);
        manager.work();
    }
}