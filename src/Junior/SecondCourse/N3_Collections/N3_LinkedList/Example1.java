package Junior.SecondCourse.N3_Collections.N3_LinkedList;



import java.util.LinkedList;

public class Example1 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan",3);
        Student st2 = new Student("Nik",2);
        Student st3 = new Student("Helen",1);
        Student st4 = new Student("Petr",4);
        Student st5 = new Student("Mara",3);
        LinkedList<Student> studentLinkedList = new LinkedList<>();
        studentLinkedList.add(st1);
        studentLinkedList.add(st2);
        studentLinkedList.add(st3);
        studentLinkedList.add(st4);
        studentLinkedList.add(st5);
        studentLinkedList.forEach(System.out::println);
        System.out.println(studentLinkedList.get(2));

        Student st6 = new Student("Zak",3);
        Student st7 = new Student("Igor",4);
        studentLinkedList.add(st6);
        studentLinkedList.add(1,st7);
        studentLinkedList.forEach(System.out::println);




    }
}
class Student{
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
