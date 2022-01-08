package Junior.SecondCourse.N3_Collections.N1_ArrayList;

import java.util.ArrayList;
import java.util.Objects;

public class Example2_2 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan",'m',22,3,8.3);
        Student st2 = new Student("Nik",'m',28,1,6.3);
        Student st3 = new Student("Elena",'f',18,3,7.3);
        Student st4 = new Student("Petr",'m',22,3,8.3);
        Student st5 = new Student("Mara",'f',20,4,8.7);

        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(st1);
        studentArrayList.add(st2);
        studentArrayList.add(st3);
        studentArrayList.add(st4);
        studentArrayList.add(st5);
        System.out.println(studentArrayList);

        Student st6 = new Student("Mara",'f',20,4,8.7);
        studentArrayList.remove(st6);
        System.out.println(studentArrayList);

        //Example3
        int index = studentArrayList.indexOf(st6); //нужно переопределить equals
        System.out.println(index);


    }
}

class Student{
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return sex == student.sex &&
                age == student.age &&
                course == student.course &&
                Double.compare(student.avgGrade, avgGrade) == 0 &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, age, course, avgGrade);
    }
}
