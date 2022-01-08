package Junior.SecondCourse.N5_Lambda.N2_Predicate;

import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Predicate;

public class PredicateEx1 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nik", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mara", 'f', 23, 3, 9.1);
        ArrayList<Student> studentsList = new ArrayList<>();
        studentsList.add(st1);
        studentsList.add(st2);
        studentsList.add(st3);
        studentsList.add(st4);
        studentsList.add(st5);

        testStudents(studentsList, s -> s.getAge() > 20);
        //Predicate<Student> p1 = student -> student.getAvgGrade() > 8;
        Predicate<Student> p2 = student -> student.getSex() == 'm';
        Predicate<Student> p3 = student -> student.getSex() == 'm'
                && student.getAvgGrade() > 8;
        //testStudents(studentsList,p1.and(p2));
        Predicate<Student> p1 = student -> student.getAvgGrade() > 8;
        testStudents(studentsList,p1.negate());
    }

    public static void testStudents(ArrayList<Student> list, Predicate<Student> predicate) {
        for (Student student : list) {
            if (predicate.test(student)) {
                System.out.println(student);
            }
        }
    }




}


class Student implements Comparable<Student> {
    private String name;
    private int age;
    private char sex;
    private int course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getAge() == student.getAge() &&
                getSex() == student.getSex() &&
                getCourse() == student.getCourse() &&
                Double.compare(student.getAvgGrade(), getAvgGrade()) == 0 &&
                Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getSex(), getCourse(), getAvgGrade());
    }


    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }
}
