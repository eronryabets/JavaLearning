package Junior.SecondCourse.SHK;

import java.util.Objects;

public class ExampleStudent {
    public static void main(String[] args) {

    }
}

/*
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Egor", "Letov", 1);
        Student st3 = new Student("Sergey", "Topolev", 4);
        Student st4 = new Student("Dima", "Perviy", 3);
        Student st5 = new Student("Zina", "Levaya", 2);
        Student st6 = new Student("Alina", "Topor", 4);
        Student st7 = new Student("Xena", "Warrior", 5);

        ArrayList<Student> studentsList = new ArrayList<>();
        studentsList.add(st1);
        studentsList.add(st2);
        studentsList.add(st3);
        studentsList.add(st4);
        studentsList.add(st5);
==============================================
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
===================================================

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

==================================================

*/
