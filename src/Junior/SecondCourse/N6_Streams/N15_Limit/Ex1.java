package Junior.SecondCourse.N6_Streams.N15_Limit;

import java.util.List;
import Junior.SecondCourse.SHK.Student;
import static Junior.SecondCourse.SHK.Student.getStudents;

public class Ex1 {
    public static void main(String[] args) {
        List<Student> students = getStudents();
        students.stream()
                .filter(student -> student.getAge() > 20).limit(3)
                .forEach(System.out::println);
    }
}
