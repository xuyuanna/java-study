/*
? 通配符：也可以理解为占位符。
? extends E： 可以接收E类型或者E的子类型。上限限定了
? super E：可以接收E类型或者E的父类型。下限限定
 */
package Day15;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo6 {
    public static void main(String[] args) {

//        ArrayList<String> al = new ArrayList<String>();
//        al.add("abcd");
//        al.add("efg");
//        al.add("hijk");
//        print(al);
//
//        System.out.println("-------------");
//
//        ArrayList<Integer> al1 = new ArrayList<Integer>();
//        al1.add(4);
//        al1.add(7);
//        al1.add(51);
//        print(al1);


        ArrayList<People> al = new ArrayList<People>();
        al.add(new People("张三"));
        al.add(new People("李四"));
        al.add(new People("王五"));
        GenericDemo6.print(al);

        System.out.println("-------");

        ArrayList<Teacher> al1 = new ArrayList<Teacher>();
        al1.add(new Teacher("师张三"));
        al1.add(new Teacher("师李四"));
        al1.add(new Teacher("师王五"));
        GenericDemo6.print(al1);

    }

    public static void print(ArrayList<? extends People> al) {
        Iterator<? extends People> it = al.iterator();


        while (it.hasNext()) {
            System.out.println(it.next().getName());
        }
    }


    //不确定类型
    /*
    public static void print(ArrayList<?> al) {
        Iterator<?> it = al.iterator();
        while (it.hasNext()) {
            System.out.println("print: " + it.next());
        }
    }
    */
}

class People {
    public String BBB;
    private String name;
    People(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

class Teacher extends People{
    public String xxx;
    Teacher(String name) {
        super(name);
    }
}


