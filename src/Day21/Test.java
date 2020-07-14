/*
有五个学生，每个学生有3门课的成绩
从键盘输入以上数据（姓名，三门课成绩）
输入的格式： zhangsan, 30, 40, 60，计算出总成绩
并把学神的信息和计算出的总分数 顺序存放在文件中
1、描述学生对象
2、定义可以操作学生对象的工具类

步骤：
1、获取键盘录入的一行数据。并将该行数据中的信息取出封装成学生对象
2、要排序，存储在集合 TreeSet中
3、将集合中的信息写入到文件中
 */

package Day21;

import sun.plugin2.os.windows.SECURITY_ATTRIBUTES;

import java.io.*;
import java.util.Set;
import java.util.TreeSet;


//描述学生对象
class Student implements Comparable<Student> {
    private String name;
    private int math, chinese, english;
    private int sum;

    Student(String name, int math, int chinese, int english) {
        this.name = name;
        this.math = math;
        this.english = english;
        this.chinese = chinese;
        sum = math + chinese + english;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + sum * 7;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Student)) {
            throw new ClassCastException("类型不匹配！");
        }
        Student s = (Student) obj;
        return this.name.equals(s.name) && this.sum == s.sum;
    }

    @Override
    public int compareTo(Student o) {
        int num = new Integer(o.sum).compareTo(this.sum);
        if (num == 0) {
            return o.name.compareTo(this.name);
        }
        return num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", math=" + math +
                ", chinese=" + chinese +
                ", english=" + english +

                '}';
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}

class StudentInfoTool {
    public static Set<Student> getStudents() throws IOException {
        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        Set<Student> students = new TreeSet<>();

        while ((line = bufferedReader.readLine()) != null) {
            if ("over".equals(line)) {
                break;
            }
            String[] info = line.split(",");
            Student student =
                    new Student(info[0], Integer.parseInt(info[1]),
                            Integer.parseInt(info[2]),
                            Integer.parseInt(info[3]));
            students.add(student);
        }
        bufferedReader.close();
        return students;
    }

    public static void write2File(Set<Student> students) throws IOException {
        BufferedWriter bufferedWriter =
                new BufferedWriter(new FileWriter("sum.txt"));
        for (Student s : students) {
            bufferedWriter.write(s.toString() + "\t");
            bufferedWriter.write(s.getSum() + "");
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        bufferedWriter.close();
    }


}

public class Test {
    public static void main(String[] args) throws IOException {

        Set<Student> students = StudentInfoTool.getStudents();
        StudentInfoTool.write2File(students);
    }


}
