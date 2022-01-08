package Junior.SecondCourse.N6_Streams.N16_Skip;

import java.util.List;
import Junior.SecondCourse.SHK.Student;
import static Junior.SecondCourse.SHK.Student.getStudents;

public class Ex1 {
    public static void main(String[] args) {
        List<Student> students = getStudents();
        students.stream().filter(s->s.getAge()>18).forEach(System.out::println);
        System.out.println("_____________________________________");
        students.stream().filter(s->s.getAge()>18).skip(2)
                .forEach(System.out::println);
        System.out.println("_____________________________________");
        students.stream().filter(s->s.getAge()>18).skip(3).forEach(System.out::println);
        System.out.println("_____________________________________");
        students.stream().filter(s->s.getAge()>18).skip(4).forEach(System.out::println);
    }
}
