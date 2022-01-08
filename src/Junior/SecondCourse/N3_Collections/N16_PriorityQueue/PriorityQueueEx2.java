package Junior.SecondCourse.N3_Collections.N16_PriorityQueue;

import java.util.Objects;
import java.util.PriorityQueue;

public class PriorityQueueEx2 {
    public static void main(String[] args) {
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Egor", "Letov", 1);
        Student st3 = new Student("Sergey", "Topolev", 4);
        Student st4 = new Student("Dima", "Perviy", 3);
        Student st5 = new Student("Zina", "Levaya", 2);
//        Student st6 = new Student("Alina", "Topor", 4);
//        Student st7 = new Student("Xena", "Warrior", 5);
        PriorityQueue<Student> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(st1);
        priorityQueue.add(st2);
        priorityQueue.add(st3);
        priorityQueue.add(st4);
        priorityQueue.add(st5);
        //System.out.println(priorityQueue);
        priorityQueue.forEach(System.out::println);
        System.out.println("===========================");
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());



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
        return this.course - o.course;
    }
}
