package Junior.SecondCourse.N3_Collections.N11_HashTable;

import java.util.Hashtable;
import java.util.Objects;

public class HashTableEx1 {
    public static void main(String[] args) {
        Hashtable<Double, Student> myHT = new Hashtable<>();

        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Egor", "Letov", 1);
        Student st3 = new Student("Sergey", "Topolev", 4);
        Student st4 = new Student("Dima", "Perviy", 3);

        myHT.put(7.8, st1);
        myHT.put(9.3, st2);
        myHT.put(5.8, st3);
        myHT.put(6.0, st4);

        myHT.forEach((d,s)-> System.out.println("Key: " + d + "; Value: " + s));


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