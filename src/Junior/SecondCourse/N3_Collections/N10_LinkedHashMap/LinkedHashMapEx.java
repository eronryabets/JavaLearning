package Junior.SecondCourse.N3_Collections.N10_LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Objects;

public class LinkedHashMapEx {
    public static void main(String[] args) {
        LinkedHashMap<Double, Student> myLHMap =
                new LinkedHashMap<>(16,0.75f,true);
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Egor", "Letov", 1);
        Student st3 = new Student("Sergey", "Topolev", 4);
        Student st4 = new Student("Dima", "Perviy", 3);

        myLHMap.put(7.2, st3);
        myLHMap.put(7.5, st4);
        myLHMap.put(5.8, st1);
        myLHMap.put(6.4, st2);

        myLHMap.forEach((d,s)-> System.out.println("Key: " + d + "; Value: " + s));
        System.out.println("===============");
        System.out.println(myLHMap.get(5.8));
        System.out.println(myLHMap.get(7.5));
        myLHMap.forEach((d,s)-> System.out.println("Key: " + d + "; Value: " + s));



    }





}
class Student implements Comparable<Student> {
    private String name;
    private String surname;
    private int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", surname='" + surname + '\'' +
                        ", course=" + course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getCourse() == student.getCourse() &&
                Objects.equals(getName(), student.getName()) &&
                Objects.equals(getSurname(), student.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getCourse());
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}