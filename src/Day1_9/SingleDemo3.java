package Day1_9;

class Student {
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    private Student() {
    }

    ;

    private static Student student = new Student();

    public static Student getStudent() {
        return student;
    }


}

public class SingleDemo3 {
    public static void main(String[] args) {

        Student student = Student.getStudent();
        student.setAge(54);

        System.out.println(student.getAge());
    }
}
