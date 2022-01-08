package Junior.SecondCourse.N6_Streams.N14_Min_Max;

import Junior.SecondCourse.SHK.Student;
import java.util.Comparator;
import java.util.List;
import static Junior.SecondCourse.SHK.Student.getStudents;

public class Ex1 {
    public static void main(String[] args) {
        List<Student> students = getStudents();

        //вернем студентам с минимальным значением
        Student minStudent = students.stream()
                .min(Comparator.comparing(Student::getAvgGrade)).get();
        System.out.println(minStudent);
        //вернем минимальный средний бал в Листе
        Double minGrade = students.stream()
                .min(Comparator.comparing(Student::getAvgGrade))
                .map(Student::getAvgGrade).get();
        System.out.println(minGrade );

        //вернем студентам с минимальным значением
        Student maxStudent = students.stream()
                .max(Comparator.comparing(Student::getAvgGrade)).get();
        System.out.println(maxStudent);

    }
}
