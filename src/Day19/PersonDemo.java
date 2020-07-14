/*
装饰设计模式：
想要对已有对象进行功能增强时，可以定义一个类，
将已有对象传入，基于已有功能，并提供加强功能
自定义的类就成为装饰类

装饰类通常会通过构造方法接收被装饰的对象
并基于被装饰的对象的功能，提供更强的功能

装饰模式比继承要灵活，避免了继承体系臃肿，降低了类与类之间的关系

 */
package Day19;

class Person{
    public void eat(){
        System.out.println("吃饭");
    }
}

class SuperPerson{
    private Person person;
    SuperPerson(Person person){
        this.person = person;
    }
    public void superEat(){
        System.out.println("洗手");
        person.eat();
        System.out.println("擦嘴");
    }
}

public class PersonDemo {
    public static void main(String[] args) {
        Person person = new Person();
        SuperPerson superPerson = new SuperPerson(person);
        superPerson.superEat();
    }
}
