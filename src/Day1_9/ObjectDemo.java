package Day1_9;/*
Object已经提供了对对象是否相同的比较方法
如果自定义类中也有比较相同的功能，没有必要重新定义
只要沿袭父类中的功能，建立自己特有的比较内容即可，这就是覆盖

 */

class Demmo {
    private int num;

    Demmo(int num) {
        this.num = num;
    }

    /*
    public boolean compare (Day1_9.Demmo demo){
        return this.num == demo.num;
     }
    */

    public boolean equals(Object obj) {   //Object obj = new Day1_9.Demmo();


        if (!(obj instanceof Demmo)) {
            return false;
        }
        //向下转型
        Demmo demo = (Demmo) obj;

        return this.num == demo.num;
    }

    public String toString(){
        return "demo:"+num;
    }

}

class Personn {
}

public class ObjectDemo {
    public static void main(String[] args) {
        Object demo1 = new Demmo(5);
        Object demo2 = new Demmo(8);

        System.out.println(demo1.equals(demo2));

        System.out.println("------------");

        Personn person = new Personn();
        System.out.println(demo1.equals(person));

        /*
        Day1_9.Demmo demo3 = demo1;
        System.out.println(demo3.equals(demo1));   //true
        System.out.println(demo1 != demo2);   //true
        */
        Demmo demmo1 = new Demmo(1);
        Demmo demmo2 = new Demmo(2);
        System.out.println(demmo1.equals(demmo2));

        System.out.println(demo1.toString());
        System.out.println(demo1.hashCode());

        //类文件对象
        Class c = demo1.getClass();
        System.out.println(c.getName());
        System.out.println(c.getName()+"@@"+Integer.toHexString(demo1.hashCode()));

        System.out.println("------");

        System.out.println(demo1.toString());
        System.out.println(demo2.toString());

    }


}
