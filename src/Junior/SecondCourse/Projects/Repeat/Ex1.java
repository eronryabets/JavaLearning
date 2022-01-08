package Junior.SecondCourse.Projects.Repeat;

import Junior.SecondCourse.SHK.Student;
import java.util.List;
import static Junior.SecondCourse.SHK.Student.getStudents;

public class Ex1 {
    public static void main(String[] args) {
        List<Student> studentList = getStudents();
        studentList.forEach(System.out::println);
    }
}
