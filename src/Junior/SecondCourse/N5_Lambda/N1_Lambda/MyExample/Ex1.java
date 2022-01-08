package Junior.SecondCourse.N5_Lambda.N1_Lambda.MyExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;
import java.util.function.Predicate;

// Просто потренируюсь вспомнить аналог лямбды через интерфейс
public class Ex1 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan",'m',22,3,8.3);
        Student st2 = new Student("Nik",'m',28,2,6.4);
        Student st3 = new Student("Elena",'f',19,1,8.9);
        Student st4 = new Student("Petr",'m',35,4,7);
        Student st5 = new Student("Mara",'f',23,3,9.1);
        ArrayList<Student> studentsList = new ArrayList<>();
        studentsList.add(st1);
        studentsList.add(st2);
        studentsList.add(st3);
        studentsList.add(st4);
        studentsList.add(st5);
        //studCheckInterface(studentsList,new CheckOverGrade());
        //with anon class
//        studCheckInterface(studentsList,new StudentChecks(){
//            @Override
//            public boolean Check(Student s) {
//                return s.getAge() > 20;
//            }
//        });
        //studentsList.forEach(s-> System.out.println(s));

//        Predicate<Student> predicate = student -> student.getAge() > 20;
//        studCheckLambda(studentsList, predicate);
//        //OR
//        studCheckLambda(studentsList, s -> s.getAge() < 20);
//        studCheckInterface(studentsList,s -> s.getAge() < 20);

//        Collections.sort(studentsList, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getCourse()-o2.getCourse();
//            }
//        });

        studentsList.sort((s1, s2) -> s1.getCourse() - s2.getCourse());

        studentsList.forEach(System.out::println);



    }

    public static void studCheckLambda(ArrayList<Student> list, Predicate<Student> predicate){
        for(Student student : list){
            if(predicate.test(student)){
                System.out.println(student);
            }
        }
    }

    public static void studCheckInterface(ArrayList<Student> list, StudentChecks sc){
        for(Student std : list){
            if(sc.Check(std)){
                System.out.println(std);
            }
        }
    }

}

interface StudentChecks {
    boolean Check(Student s);
}

class CheckOverGrade implements StudentChecks{

    @Override
    public boolean Check(Student s) {
        return s.getAvgGrade()>8;
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
        return this.age-o.age;
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