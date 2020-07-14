package Day1_9;

class Person {
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

}

public class PersonDemo {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(88);
        System.out.println(p.getAge());
    }
}
