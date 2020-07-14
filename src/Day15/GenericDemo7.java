package Day15;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class GenericDemo7 {
    public static void main(String[] args) {
        TreeSet<Tea> ts = new TreeSet<Tea>(new Compa());
        ts.add(new Tea("abc03"));
        ts.add(new Tea("abc02"));
        ts.add(new Tea("abc06"));
        ts.add(new Tea("abc01"));

        Iterator <Tea> it = ts.iterator();
        while (it.hasNext()){
            System.out.println(it.next().getName());
        }

        System.out.println("---------------------");


        TreeSet<Wor> ts1 = new TreeSet<Wor>(new Compa());
        ts1.add(new Wor("abc0003"));
        ts1.add(new Wor("abc0002"));
        ts1.add(new Wor("abc0006"));
        ts1.add(new Wor("abc0001"));

        Iterator <Wor> it1 = ts1.iterator();
        while (it1.hasNext()){
            System.out.println(it1.next().getName());
        }
    }
}

//class Compa1 implements Comparator<Tea>{
//
//    @Override
//    public int compare(Tea t1, Tea t2) {
//        return t1.getName().compareTo(t2.getName());
//    }
//}

//class Compa2 implements Comparator<Wor>{
//
//    @Override
//    public int compare(Wor w1, Wor w2) {
//        return w1.getName().compareTo(w2.getName());
//    }
//}

class Compa implements Comparator<Peo>{

    @Override
    public int compare(Peo p1, Peo p2) {
        return p1.getName().compareTo(p2.getName());
    }

}

class Peo {
    private String name;

    Peo(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

class Tea extends Peo {
    Tea(String name) {
        super(name);
    }
}

class Wor extends Peo {
    Wor(String name) {
        super(name);
    }
}
